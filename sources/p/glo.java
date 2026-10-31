package p;

import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class glo implements kko {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mko b;

    public /* synthetic */ glo(mko mkoVar, byte b) {
        this.a = b;
        this.b = mkoVar;
    }

    public final zob1 a() {
        switch (this.a) {
            case 0:
                return ((mlo) this.b).f;
            case 1:
                return this.b.a.c;
            case 2:
                return ((olo) this.b).a.c;
            case 3:
                MobiusLoop mobiusLoop = ((llo) this.b).e;
                if (mobiusLoop == null) {
                    n57.e("Trying to access CurationStateApiService.model before starting the service or after it's been stopped");
                    return gio1.b(slo.a);
                }
                ijo ijoVar = slo.a;
                Object obj = mobiusLoop.i;
                obj.getClass();
                bpb1 bpb1VarB = gio1.b(obj);
                mobiusLoop.b(new qlo(bpb1VarB, (byte) 0));
                return bpb1VarB;
            default:
                MobiusLoop mobiusLoop2 = ((klo) this.b).c;
                if (mobiusLoop2 == null) {
                    u890.C("loop");
                    throw null;
                }
                Object obj2 = mobiusLoop2.i;
                obj2.getClass();
                bpb1 bpb1VarB2 = gio1.b(obj2);
                mobiusLoop2.b(new qlo(bpb1VarB2, (byte) 1));
                return bpb1VarB2;
        }
    }

    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        switch (this.a) {
            case 0:
                ((mlo) this.b).c(new v450(str, tv80Var));
                return rih1.a;
            case 1:
                gjo gjoVar = this.b.a;
                v450 v450Var = new v450(str, tv80Var);
                synchronized (gjoVar.d) {
                    MobiusLoop mobiusLoop = gjoVar.e;
                    if (mobiusLoop != null) {
                        mobiusLoop.a(v450Var);
                    }
                    break;
                }
                return rih1.a;
            case 2:
                gjo gjoVar2 = ((olo) this.b).a;
                v450 v450Var2 = new v450(str, tv80Var);
                synchronized (gjoVar2.d) {
                    MobiusLoop mobiusLoop2 = gjoVar2.e;
                    if (mobiusLoop2 != null) {
                        mobiusLoop2.a(v450Var2);
                    }
                    break;
                }
                return rih1.a;
            case 3:
                Set set = s4b1.f;
                String strZ = uic.x(str).z();
                if (strZ != null) {
                    MobiusLoop mobiusLoop3 = ((llo) this.b).e;
                    if (mobiusLoop3 != null) {
                        mobiusLoop3.a(new v450(strZ, tv80Var));
                    } else {
                        n57.e("Trying to curate an item with CurationStateApiService before the service is started or after it's been stopped");
                    }
                }
                return rih1.a;
            default:
                MobiusLoop mobiusLoop4 = ((klo) this.b).c;
                if (mobiusLoop4 != null) {
                    mobiusLoop4.a(new v450(str, tv80Var));
                    return rih1.a;
                }
                u890.C("loop");
                throw null;
        }
    }

    public final void c(Set set) {
        byte b = this.a;
        nlo nloVar = this.b;
        switch (b) {
            case 0:
                ((mlo) nloVar).c(new z450(set));
                return;
            case 1:
                nloVar.a.d(set);
                return;
            case 2:
                ((olo) nloVar).a.d(set);
                return;
            case 3:
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Set set2 = s4b1.f;
                    String strZ = uic.x(str).z();
                    if (strZ != null) {
                        arrayList.add(strZ);
                    }
                }
                Set setP1 = o7h.p1(arrayList);
                if (setP1.isEmpty()) {
                    return;
                }
                MobiusLoop mobiusLoop = ((llo) nloVar).e;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new z450(setP1));
                    return;
                } else {
                    n57.e("Trying to update items of interest in CurationStateApiService before the service is started or after it's been stopped");
                    return;
                }
            default:
                MobiusLoop mobiusLoop2 = ((klo) nloVar).c;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.a(new z450(set));
                    return;
                } else {
                    u890.C("loop");
                    throw null;
                }
        }
    }
}
