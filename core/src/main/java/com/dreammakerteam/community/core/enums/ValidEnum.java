package com.dreammakerteam.community.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Contract;

/**
 * 有效性枚举
 * @author ty
 * @date 2018/3/11 下午 10:27
 */
@AllArgsConstructor
public enum ValidEnum {
    /** 有效 */
    VALID(true),
    /** 无效 */
    INVALID(false);

    @Getter @Setter
    private Boolean value;

    @Contract(pure = true)
    public ValidEnum valueOf(Boolean obj) {
        return obj != null && obj ? VALID : INVALID;
    }
}
