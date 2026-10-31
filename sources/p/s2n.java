package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class s2n {
    public t2n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gc31 gc31Var) {
        return null;
    }

    public t2n b(Type type, Annotation[] annotationArr, gc31 gc31Var) {
        if (type == uz21.class) {
            return m5n1.I(annotationArr, ifc1.class) ? vgp1.Z : xbp1.N0;
        }
        if (type == Void.class) {
            return rbc.O0;
        }
        if (m5n1.g && type == rih1.class) {
            return zp8.N0;
        }
        return null;
    }
}
