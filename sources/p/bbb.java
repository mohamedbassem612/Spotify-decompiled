package p;

import com.spotify.player.model.Context$Metadata;
import com.spotify.pses.v1.proto.AuthMethod;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bbb {
    public final k1i a;
    public final kg0 b;
    public final mwn0 c;
    public final ohv0 d;
    public final gp41 e;
    public final i8h1 f;
    public final g1f0 g;
    public final q5o h;

    public bbb(k1i k1iVar, kg0 kg0Var, mwn0 mwn0Var, ohv0 ohv0Var, gp41 gp41Var, i8h1 i8h1Var, g1f0 g1f0Var, q5o q5oVar) {
        this.a = k1iVar;
        this.b = kg0Var;
        this.c = mwn0Var;
        this.d = ohv0Var;
        this.e = gp41Var;
        this.f = i8h1Var;
        this.g = g1f0Var;
        this.h = q5oVar;
    }

    public final ArrayList a(wab wabVar) {
        ArrayList arrayList = new ArrayList();
        h290 h290VarQ = wabVar.b.q();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : h290VarQ) {
            AuthMethod authMethod = (AuthMethod) obj;
            if (authMethod.p() == fh8.AUTH_PROVIDER_STATE_LOGIN_SIGNUP || authMethod.p() == fh8.AUTH_PROVIDER_STATE_LOGIN_ONLY) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            jj8 jj8Var = null;
            if (!it.hasNext()) {
                int i = 0;
                for (Object obj2 : this.a.n(arrayList3, new yab(this, (byte) 2))) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    pbc pbcVar = (pbc) obj2;
                    arrayList.add(new zk8(new lj8(pbcVar.a, i == 0), pbcVar.b));
                    i = i2;
                }
                return arrayList;
            }
            switch (xab.a[((AuthMethod) it.next()).o().ordinal()]) {
                case -1:
                case 7:
                case 8:
                case 9:
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    jj8Var = jj8.f;
                    break;
                case 2:
                    jj8Var = jj8.b;
                    break;
                case 3:
                    jj8Var = jj8.a;
                    break;
                case 4:
                    jj8Var = jj8.c;
                    break;
                case 5:
                    jj8Var = jj8.d;
                    break;
                case 6:
                    if (this.g.p() && fno1.k()) {
                        jj8Var = jj8.e;
                    }
                    break;
            }
            if (jj8Var != null) {
                arrayList3.add(jj8Var);
            }
        }
    }

    public final ArrayList b(wab wabVar) {
        ArrayList arrayList = new ArrayList();
        h290 h290VarQ = wabVar.b.q();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : h290VarQ) {
            if (((AuthMethod) obj).p() == fh8.AUTH_PROVIDER_STATE_LOGIN_SIGNUP) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            jj8 jj8Var = null;
            if (!it.hasNext()) {
                int i = 0;
                for (Object obj2 : this.a.n(arrayList3, new yab(this, (byte) 3))) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    pbc pbcVar = (pbc) obj2;
                    arrayList.add(new zk8(new lj8(pbcVar.a, i == 0), pbcVar.b));
                    i = i2;
                }
                return arrayList;
            }
            switch (xab.a[((AuthMethod) it.next()).o().ordinal()]) {
                case -1:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    jj8Var = jj8.f;
                    break;
                case 2:
                    jj8Var = jj8.b;
                    break;
                case 3:
                    jj8Var = jj8.a;
                    break;
                case 4:
                    jj8Var = jj8.c;
                    break;
                case 5:
                    jj8Var = jj8.d;
                    break;
            }
            if (jj8Var != null) {
                arrayList3.add(jj8Var);
            }
        }
    }

    public final void c(int i) {
        this.d.a(new mhv0(this.e.a, ktd.d(i), ew80.c, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
    }
}
