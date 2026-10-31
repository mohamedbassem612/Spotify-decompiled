package p;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class n7a0 {
    public static final Map a = sqg0.J(new mmr0[]{new mmr0("PACKAGE", EnumSet.noneOf(z7b0.class)), new mmr0("TYPE", EnumSet.of(z7b0.CLASS, z7b0.FILE)), new mmr0("ANNOTATION_TYPE", EnumSet.of(z7b0.ANNOTATION_CLASS)), new mmr0("TYPE_PARAMETER", EnumSet.of(z7b0.TYPE_PARAMETER)), new mmr0("FIELD", EnumSet.of(z7b0.FIELD)), new mmr0("LOCAL_VARIABLE", EnumSet.of(z7b0.LOCAL_VARIABLE)), new mmr0("PARAMETER", EnumSet.of(z7b0.VALUE_PARAMETER)), new mmr0("CONSTRUCTOR", EnumSet.of(z7b0.CONSTRUCTOR)), new mmr0("METHOD", EnumSet.of(z7b0.FUNCTION, z7b0.PROPERTY_GETTER, z7b0.PROPERTY_SETTER)), new mmr0("TYPE_USE", EnumSet.of(z7b0.TYPE))});
    public static final Map b = sqg0.J(new mmr0[]{new mmr0("RUNTIME", y7b0.a), new mmr0("CLASS", y7b0.b), new mmr0("SOURCE", y7b0.c)});

    public static e46 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof rb11) {
                arrayList.add(obj);
            }
        }
        ArrayList<z7b0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w7x w7xVar = (EnumSet) a.get(ajn0.e(((rb11) it.next()).b.name()).b());
            if (w7xVar == null) {
                w7xVar = w7x.a;
            }
            r7h.W((Iterable) w7xVar, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (z7b0 z7b0Var : arrayList2) {
            kf30 kf30Var = rfb1.u;
            arrayList3.add(new b1z(new heg(kf30Var.b(), kf30Var.a.g()), ajn0.e(z7b0Var.name())));
        }
        return new e46(arrayList3, aht.Q0);
    }
}
