package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class umc1 extends aqi0 {
    public final zim0 b;
    public final kf30 c;

    public umc1(zim0 zim0Var, kf30 kf30Var) {
        this.b = zim0Var;
        this.c = kf30Var;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        if (wgtVar.a(wgt.h)) {
            kf30 kf30Var = this.c;
            if (!kf30Var.a.c() || !wgtVar.a.contains(tgt.a)) {
                zim0 zim0Var = this.b;
                Collection collectionI = zim0Var.i(kf30Var, iu30Var);
                ArrayList arrayList = new ArrayList(collectionI.size());
                Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    ajn0 ajn0VarG = ((kf30) it.next()).a.g();
                    if (((Boolean) iu30Var.invoke(ajn0VarG)).booleanValue()) {
                        dub0 dub0Var = null;
                        if (!ajn0VarG.b) {
                            dub0 dub0VarD = zim0Var.D(kf30Var.a(ajn0VarG));
                            toe0 toe0Var = dub0VarD.g;
                            mma0 mma0Var = dub0.i[1];
                            if (!((Boolean) toe0Var.invoke()).booleanValue()) {
                                dub0Var = dub0VarD;
                            }
                        }
                        h4p1.d(arrayList, dub0Var);
                    }
                }
                return arrayList;
            }
        }
        return z6x.a;
    }

    @Override // p.aqi0, p.zpi0
    public final Set e() {
        return w7x.a;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
