package p;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fb11 extends db11 {
    public final Object[] b;

    public fb11(ajn0 ajn0Var, Object[] objArr) {
        super(ajn0Var);
        this.b = objArr;
    }

    public final ArrayList a() {
        db11 nb11Var;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = bb11.a;
            if (Enum.class.isAssignableFrom(cls)) {
                nb11Var = new rb11(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                nb11Var = new eb11(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                nb11Var = new fb11(null, (Object[]) obj);
            } else {
                nb11Var = obj instanceof Class ? new nb11(null, (Class) obj) : new tb11(null, obj);
            }
            arrayList.add(nb11Var);
        }
        return arrayList;
    }
}
