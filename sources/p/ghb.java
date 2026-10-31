package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ghb {
    public static final Set d = f46.S0(new Integer[]{1028, 1032, 1048});
    public final wl4 a;
    public final Optional b;
    public final Optional c;

    public ghb(wl4 wl4Var, Optional optional, Optional optional2) {
        this.a = wl4Var;
        this.b = optional;
        this.c = optional2;
    }

    public final List a() {
        boolean zA = this.a.a();
        z6x z6xVarH = z6x.a;
        if (zA) {
            Optional optional = this.c;
            if (optional.isPresent() && !((crd) optional.get()).a()) {
                Optional optional2 = this.b;
                if (optional2.isPresent()) {
                    List list = (List) ((ck) optional2.get()).f.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        qi qiVar = (hi) obj;
                        if (qiVar.e == 3 && u890.j(qiVar.g, Boolean.TRUE)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() != 1) {
                        arrayList.size();
                        list.size();
                        return z6xVarH;
                    }
                    qi qiVar2 = (hi) o7h.V0(arrayList);
                    ii iiVarA = qiVar2.a();
                    boolean zI0 = false;
                    int i = iiVarA != null ? iiVarA.b : 0;
                    if (i == 3) {
                        zI0 = true;
                    } else if (i == 0 || i == 7) {
                        Set set = d;
                        String str = qiVar2.d;
                        zI0 = o7h.i0(set, str != null ? nhc1.c0(str) : null);
                    }
                    if (zI0) {
                        qlu qluVar = new qlu(new mf20(z561.f0(c7b.N0, new oh40(z561.T(c7b.Z, new i46(qiVar2.i.a, (byte) 1)), new k0d((byte) 26), (byte) 1))), c7b.O0);
                        if (qluVar.hasNext()) {
                            Object next = qluVar.next();
                            if (qluVar.hasNext()) {
                                z6xVarH = ydh.h(next);
                                while (qluVar.hasNext()) {
                                    z6xVarH.add(qluVar.next());
                                }
                            } else {
                                z6xVarH = Collections.singletonList(next);
                            }
                        }
                        if (z6xVarH.isEmpty()) {
                            return z6xVarH;
                        }
                        z6xVarH.size();
                        return z6xVarH;
                    }
                }
            }
        }
        return z6xVarH;
    }
}
