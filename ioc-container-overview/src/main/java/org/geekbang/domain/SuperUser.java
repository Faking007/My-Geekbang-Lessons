package org.geekbang.domain;

import lombok.Data;
import lombok.ToString;
import org.geekbang.annotation.Super;

@Super
@Data
@ToString(callSuper = true)
public class SuperUser extends User{

    private String address;
}
