package p;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface wzr0 {
    String encoding() default "binary";

    String value() default "";
}
