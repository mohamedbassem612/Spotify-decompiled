package p;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pfp0 implements nma0 {
    public final Object a;
    public final List b;
    public final znb0 c;

    public pfp0(String str, Object obj) {
        this.a = obj;
        this.b = z6x.a;
        this.c = dm5.S(2, new qga0(str, this, (byte) 9));
    }

    public final Object deserialize(dar darVar) {
        h661 descriptor = getDescriptor();
        x1k x1kVarB = darVar.b(descriptor);
        x1kVarB.getClass();
        int iP = x1kVarB.p(getDescriptor());
        if (iP == -1) {
            x1kVarB.a(descriptor);
            return this.a;
        }
        uh61.j(f4i1.c(iP, "Unexpected index "));
        return null;
    }

    public final h661 getDescriptor() {
        return (h661) this.c.getValue();
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.b(getDescriptor()).a(getDescriptor());
    }

    public pfp0(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        this.b = Arrays.asList(annotationArr);
    }
}
