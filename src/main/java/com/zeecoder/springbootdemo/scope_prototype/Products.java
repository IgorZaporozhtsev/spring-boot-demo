package com.zeecoder.springbootdemo.scope_prototype;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
@Setter @Getter
public class Products {

}
