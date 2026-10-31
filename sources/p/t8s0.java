package p;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface t8s0 {
    boolean encoded() default false;

    String value();
}
