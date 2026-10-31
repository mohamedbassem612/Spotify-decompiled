package p;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p311 extends v3k {
    public static final bpb1 A = gio1.b(hno1.n());
    public static final AtomicReference B = new AtomicReference(Boolean.FALSE);
    public long a;
    public final u5c b;
    public final kqi0 c;
    public final Object d;
    public faa0 e;
    public Throwable f;
    public final ArrayList g;
    public List h;
    public oen0 i;
    public final bfn0 j;
    public final ArrayList k;
    public final ArrayList l;
    public final nen0 m;
    public final rok0 n;
    public final nen0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nen0 f90p;
    public ArrayList q;
    public oen0 r;
    public ohd s;
    public final bpb1 t;
    public boolean u;
    public final bpb1 v;
    public final yt91 w;
    public final gaa0 x;
    public final o8n y;
    public final hwb z;

    /* JADX WARN: Type inference failed for: r3v0, types: [p.j311] */
    public p311(o8n o8nVar) {
        final byte b = 0;
        u5c u5cVar = new u5c(new Function0(this) { // from class: p.j311
            public final /* synthetic */ p311 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                rih1 rih1Var = rih1.a;
                p311 p311Var = this.b;
                switch (b2) {
                    case 0:
                        p311Var.J();
                        break;
                    default:
                        p311Var.J();
                        break;
                }
                return rih1Var;
            }
        });
        this.b = u5cVar;
        final byte b2 = 1;
        this.c = new kqi0((j311) new Function0(this) { // from class: p.j311
            public final /* synthetic */ p311 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                rih1 rih1Var = rih1.a;
                p311 p311Var = this.b;
                switch (b3) {
                    case 0:
                        p311Var.J();
                        break;
                    default:
                        p311Var.J();
                        break;
                }
                return rih1Var;
            }
        });
        this.d = new Object();
        this.g = new ArrayList();
        this.i = new oen0();
        this.j = new bfn0(0, new h4k[16]);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new nen0();
        this.n = new rok0((byte) 8);
        this.o = new nen0();
        this.f90p = new nen0();
        this.t = gio1.b((Object) null);
        this.v = gio1.b(l311.c);
        this.w = new yt91();
        gaa0 gaa0VarE = op71.e(o8nVar.A(fkj0.W0));
        gaa0VarE.L(new z94(this, (byte) 2));
        this.x = gaa0VarE;
        this.y = o8nVar.y(u5cVar).y(gaa0VarE);
        this.z = new hwb((byte) 22);
    }

    public static void A(ten0 ten0Var) {
        try {
            if (ten0Var.w() instanceof kv91) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            ten0Var.c();
        } catch (Throwable th) {
            ten0Var.c();
            throw th;
        }
    }

    public static final void C(p311 p311Var, znm0 znm0Var, znm0 znm0Var2) {
        List list = znm0Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                znm0 znm0Var3 = (znm0) list.get(i);
                p311Var.n.a(znm0Var3.a, new x5o0(znm0Var3, znm0Var));
                C(p311Var, znm0Var, znm0Var3);
            }
        }
    }

    public static final void L(ArrayList arrayList, p311 p311Var, h4k h4kVar) {
        arrayList.clear();
        synchronized (p311Var.d) {
            Iterator it = p311Var.l.iterator();
            while (it.hasNext()) {
                znm0 znm0Var = (znm0) it.next();
                if (znm0Var.c.equals(h4kVar)) {
                    arrayList.add(znm0Var);
                    it.remove();
                }
            }
        }
    }

    public final void B() {
        synchronized (this.d) {
            if (((l311) this.v.getValue()).compareTo(l311.e) >= 0) {
                bpb1 bpb1Var = this.v;
                l311 l311Var = l311.b;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, l311Var);
            }
        }
        ha71.o(this.x);
    }

    public final mhd D() {
        bpb1 bpb1Var = this.v;
        int iCompareTo = ((l311) bpb1Var.getValue()).compareTo(l311.b);
        bpb1 bpb1Var2 = this.t;
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.k;
        bfn0 bfn0Var = this.j;
        if (iCompareTo > 0) {
            Object value = bpb1Var2.getValue();
            l311 l311Var = l311.f;
            l311 l311Var2 = l311.c;
            if (value == null) {
                if (this.e == null) {
                    this.i = new oen0();
                    bfn0Var.g();
                    if (E() || G()) {
                        l311Var2 = l311.d;
                    }
                } else {
                    l311Var2 = (bfn0Var.c != 0 || this.i.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || E() || G() || this.m.j()) ? l311Var : l311.e;
                }
            }
            bpb1Var.getClass();
            bpb1Var.m((Object) null, l311Var2);
            if (l311Var2 != l311Var) {
                return null;
            }
            ohd ohdVar = this.s;
            this.s = null;
            return ohdVar;
        }
        List listI = I();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
        }
        this.g.clear();
        this.h = z6x.a;
        this.i = new oen0();
        bfn0Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.q = null;
        ohd ohdVar2 = this.s;
        if (ohdVar2 != null) {
            ezn1.l(ohdVar2);
        }
        this.s = null;
        bpb1Var2.l((Object) null);
        return null;
    }

    public final boolean E() {
        return !this.u && this.b.b.r();
    }

    public final boolean F() {
        return this.j.c != 0 || E() || G() || this.m.j();
    }

    public final boolean G() {
        return !this.u && this.c.l();
    }

    public final boolean H() {
        boolean z;
        synchronized (this.d) {
            z = this.i.h() || this.j.c != 0 || E() || G();
        }
        return z;
    }

    public final List I() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.g;
        z6x arrayList2 = arrayList.isEmpty() ? z6x.a : new ArrayList(arrayList);
        this.h = arrayList2;
        return arrayList2;
    }

    public final void J() {
        ohd ohdVarD;
        synchronized (this.d) {
            ohdVarD = D();
            if (((l311) this.v.getValue()).compareTo(l311.b) <= 0) {
                throw lgo1.b("Recomposer shutdown; frame clock awaiter will never resume", this.f);
            }
        }
        if (ohdVarD != null) {
            ohdVarD.resumeWith(rih1.a);
        }
    }

    public final void K(h4k h4kVar) {
        synchronized (this.d) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((znm0) arrayList.get(i)).c.equals(h4kVar)) {
                    ArrayList arrayList2 = new ArrayList();
                    L(arrayList2, this, h4kVar);
                    while (!arrayList2.isEmpty()) {
                        M(arrayList2, null);
                        L(arrayList2, this, h4kVar);
                    }
                    return;
                }
            }
        }
    }

    public final List M(List list, oen0 oen0Var) {
        ArrayList arrayList;
        x5o0 x5o0VarT;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            h4k h4kVar = ((znm0) obj).c;
            Object arrayList2 = map.get(h4kVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(h4kVar, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            h4k h4kVar2 = (h4k) entry.getKey();
            List list2 = (List) entry.getValue();
            if (h4kVar2.V0.F) {
                g0k.a("Check failed");
            }
            ten0 ten0VarE = ekb.E(new waq0(h4kVar2, (byte) 5), new gub0(h4kVar2, oen0Var, (byte) 15));
            try {
                jv91 jv91VarJ = ten0VarE.j();
                try {
                    synchronized (this.d) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                znm0 znm0Var = (znm0) list2.get(i2);
                                Object objB = dwm0.b(this.m, znm0Var.a);
                                znm0 znm0Var2 = (znm0) objB;
                                if (znm0Var2 != null) {
                                    this.n.w(znm0Var2);
                                }
                                arrayList.add(oqn1.n(znm0Var, objB));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                mmr0 mmr0Var = (mmr0) arrayList.get(i3);
                                if (mmr0Var.b == null && this.n.e(((znm0) mmr0Var.a).a)) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size4 = arrayList.size();
                                    for (int i4 = 0; i4 < size4; i4++) {
                                        mmr0 mmr0VarN = (mmr0) arrayList.get(i4);
                                        if (mmr0VarN.b == null && (x5o0VarT = this.n.t(((znm0) mmr0VarN.a).a)) != null) {
                                            znm0 znm0Var3 = x5o0VarT.a;
                                            dwm0.a(this.f90p, x5o0VarT.b, znm0Var3);
                                            mmr0VarN = oqn1.n(mmr0VarN.a, znm0Var3);
                                        }
                                        arrayList3.add(mmr0VarN);
                                    }
                                    arrayList = arrayList3;
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((mmr0) arrayList.get(i5)).b != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((mmr0) arrayList.get(i6)).b == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        mmr0 mmr0Var2 = (mmr0) arrayList.get(i7);
                                        znm0 znm0Var4 = mmr0Var2.b == null ? (znm0) mmr0Var2.a : null;
                                        if (znm0Var4 != null) {
                                            arrayList4.add(znm0Var4);
                                        }
                                    }
                                    synchronized (this.d) {
                                        r7h.W(arrayList4, this.l);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((mmr0) obj2).b != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    h4kVar2.t(arrayList);
                    jv91.q(jv91VarJ);
                    A(ten0VarE);
                } catch (Throwable th2) {
                    jv91.q(jv91VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                A(ten0VarE);
                throw th3;
            }
        }
        return o7h.l1(map.keySet());
    }

    public final h4k N(h4k h4kVar, oen0 oen0Var) {
        if (h4kVar.V0.F || h4kVar.W0 == 3) {
            return null;
        }
        oen0 oen0Var2 = this.r;
        if (oen0Var2 == null || !oen0Var2.c(h4kVar)) {
            ten0 ten0VarE = ekb.E(new waq0(h4kVar, (byte) 5), new gub0(h4kVar, oen0Var, (byte) 15));
            try {
                jv91 jv91VarJ = ten0VarE.j();
                if (oen0Var != null) {
                    try {
                        if (oen0Var.h()) {
                            qga0 qga0Var = new qga0(oen0Var, h4kVar, (byte) 10);
                            x340 x340Var = h4kVar.V0;
                            if (x340Var.F) {
                                g0k.a("Preparing a composition while composing is not supported");
                            }
                            x340Var.F = true;
                            try {
                                qga0Var.invoke();
                                x340Var.F = false;
                            } catch (Throwable th) {
                                x340Var.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        jv91.q(jv91VarJ);
                        throw th2;
                    }
                }
                boolean zX = h4kVar.x();
                jv91.q(jv91VarJ);
                A(ten0VarE);
                if (zX) {
                    return h4kVar;
                }
            } catch (Throwable th3) {
                A(ten0VarE);
                throw th3;
            }
        }
        return null;
    }

    public final void O(Throwable th, h4k h4kVar) throws Throwable {
        if (!((Boolean) B.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.d) {
                k311 k311Var = (k311) this.t.getValue();
                if (k311Var != null) {
                    throw k311Var.a();
                }
                bpb1 bpb1Var = this.t;
                k311 k311Var2 = new k311(th);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, k311Var2);
            }
            throw th;
        }
        synchronized (this.d) {
            try {
                this.k.clear();
                this.j.g();
                this.i = new oen0();
                this.l.clear();
                this.m.a();
                this.o.a();
                bpb1 bpb1Var2 = this.t;
                k311 k311Var3 = new k311(th);
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, k311Var3);
                if (h4kVar != null) {
                    Q(h4kVar);
                }
                if (D() != null) {
                    g0k.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean P() {
        boolean zF;
        synchronized (this.d) {
            if (this.i.g()) {
                return F();
            }
            List listI = I();
            jj41 jj41VarZ = t4n1.z(this.i);
            this.i = new oen0();
            try {
                int size = listI.size();
                for (int i = 0; i < size; i++) {
                    ((h4k) listI.get(i)).y(jj41VarZ);
                    if (((l311) this.v.getValue()).compareTo(l311.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    if (D() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zF = F();
                }
                return zF;
            } catch (Throwable th) {
                synchronized (this.d) {
                    oen0 oen0Var = this.i;
                    int i2 = oen0Var.d;
                    Iterator<E> it = jj41VarZ.iterator();
                    while (it.hasNext()) {
                        oen0Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void Q(h4k h4kVar) {
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.q = arrayList;
        }
        if (!arrayList.contains(h4kVar)) {
            arrayList.add(h4kVar);
        }
        if (this.g.remove(h4kVar)) {
            this.h = null;
        }
    }

    public final Object R(a8d1 a8d1Var) {
        Object objH = c921.H(this.b, new sew0(this, new o311(this, null), s110.h(a8d1Var.getContext()), (lnm) null, (byte) 8), a8d1Var);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objH != d9nVar) {
            objH = rih1Var;
        }
        return objH == d9nVar ? objH : rih1Var;
    }

    @Override // p.v3k
    public final void a(h4k h4kVar, vu30 vu30Var) throws Throwable {
        l311 l311Var;
        boolean zContains;
        boolean z = h4kVar.V0.F;
        synchronized (this.d) {
            l311 l311Var2 = (l311) this.v.getValue();
            l311Var = l311.b;
            zContains = l311Var2.compareTo(l311Var) > 0 ? true ^ I().contains(h4kVar) : true;
        }
        try {
            ten0 ten0VarE = ekb.E(new waq0(h4kVar, (byte) 5), new gub0(h4kVar, (Object) null, (byte) 15));
            try {
                jv91 jv91VarJ = ten0VarE.j();
                try {
                    h4kVar.m(vu30Var);
                    jv91.q(jv91VarJ);
                    A(ten0VarE);
                    synchronized (this.d) {
                        if (((l311) this.v.getValue()).compareTo(l311Var) > 0 && !I().contains(h4kVar)) {
                            this.g.add(h4kVar);
                            this.h = null;
                        }
                    }
                    if (!z) {
                        ekb.v();
                    }
                    try {
                        K(h4kVar);
                        try {
                            h4kVar.e();
                            h4kVar.i();
                            if (z) {
                                return;
                            }
                            ekb.v();
                        } catch (Throwable th) {
                            O(th, null);
                        }
                    } catch (Throwable th2) {
                        O(th2, h4kVar);
                    }
                } catch (Throwable th3) {
                    jv91.q(jv91VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                A(ten0VarE);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.d) {
                }
            }
            O(th5, h4kVar);
        }
    }

    @Override // p.v3k
    public final oen0 b(h4k h4kVar, n181 n181Var, vu30 vu30Var) {
        yt91 yt91Var = this.w;
        try {
            n181 n181Var2 = h4kVar.P0;
            h4kVar.P0 = n181Var;
            try {
                a(h4kVar, vu30Var);
                oen0 oen0Var = (oen0) yt91Var.e();
                if (oen0Var == null) {
                    oen0Var = ij41.a;
                }
                h4kVar.P0 = n181Var2;
                yt91Var.j((Object) null);
                return oen0Var;
            } catch (Throwable th) {
                h4kVar.P0 = n181Var2;
                throw th;
            }
        } catch (Throwable th2) {
            yt91Var.j((Object) null);
            throw th2;
        }
    }

    @Override // p.v3k
    public final void c(znm0 znm0Var) {
        ohd ohdVarD;
        synchronized (this.d) {
            try {
                dwm0.a(this.m, znm0Var.a, znm0Var);
                if (znm0Var.h != null) {
                    C(this, znm0Var, znm0Var);
                }
                ohdVarD = D();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ohdVarD != null) {
            ohdVarD.resumeWith(rih1.a);
        }
    }

    @Override // p.v3k
    public final o8n k() {
        return this.y;
    }

    @Override // p.v3k
    public final void n(znm0 znm0Var) {
        ohd ohdVarD;
        synchronized (this.d) {
            this.l.add(znm0Var);
            ohdVarD = D();
        }
        if (ohdVarD != null) {
            ohdVarD.resumeWith(rih1.a);
        }
    }

    @Override // p.v3k
    public final void o(h4k h4kVar) {
        mhd mhdVarD;
        synchronized (this.d) {
            if (this.j.i(h4kVar)) {
                mhdVarD = null;
            } else {
                this.j.b(h4kVar);
                mhdVarD = D();
            }
        }
        if (mhdVarD != null) {
            ((ohd) mhdVarD).resumeWith(rih1.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[LOOP:0: B:16:0x0049->B:29:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[EDGE_INSN: B:37:0x008c->B:30:0x008c BREAK  A[LOOP:0: B:16:0x0049->B:29:0x0089], SYNTHETIC] */
    @Override // p.v3k
    public final void p(znm0 znm0Var, ynm0 ynm0Var, j06 j06Var) {
        wdn0 wdn0Var;
        synchronized (this.d) {
            this.o.m(znm0Var, ynm0Var);
            Object objG = this.f90p.g(znm0Var);
            if (objG == null) {
                wdn0Var = lfp0.b;
            } else if (objG instanceof wdn0) {
                wdn0Var = (wdn0) objG;
            } else {
                Object[] objArr = lfp0.a;
                wdn0 wdn0Var2 = new wdn0(1);
                wdn0Var2.b(objG);
                wdn0Var = wdn0Var2;
            }
            if (wdn0Var.j()) {
                nen0 nen0VarD = ynm0Var.a().d(j06Var, wdn0Var);
                Object[] objArr2 = nen0VarD.b;
                Object[] objArr3 = nen0VarD.c;
                long[] jArr = nen0VarD.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.o.m((znm0) obj, (ynm0) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p.v3k
    public final ynm0 q(znm0 znm0Var) {
        ynm0 ynm0Var;
        synchronized (this.d) {
            ynm0Var = (ynm0) this.o.k(znm0Var);
        }
        return ynm0Var;
    }

    @Override // p.v3k
    public final oen0 r(h4k h4kVar, n181 n181Var, oen0 oen0Var) {
        yt91 yt91Var = this.w;
        try {
            P();
            h4kVar.y(t4n1.z(oen0Var));
            n181 n181Var2 = h4kVar.P0;
            h4kVar.P0 = n181Var;
            try {
                h4k h4kVarN = N(h4kVar, null);
                if (h4kVarN != null) {
                    K(h4kVar);
                    h4kVarN.e();
                    h4kVarN.i();
                }
                oen0 oen0Var2 = (oen0) yt91Var.e();
                if (oen0Var2 == null) {
                    oen0Var2 = ij41.a;
                }
                h4kVar.P0 = n181Var2;
                yt91Var.j((Object) null);
                return oen0Var2;
            } catch (Throwable th) {
                h4kVar.P0 = n181Var2;
                throw th;
            }
        } catch (Throwable th2) {
            yt91Var.j((Object) null);
            throw th2;
        }
    }

    @Override // p.v3k
    public final void u(h311 h311Var) {
        yt91 yt91Var = this.w;
        oen0 oen0Var = (oen0) yt91Var.e();
        if (oen0Var == null) {
            oen0 oen0Var2 = ij41.a;
            oen0Var = new oen0();
            yt91Var.j(oen0Var);
        }
        oen0Var.a(h311Var);
    }

    @Override // p.v3k
    public final void v(h4k h4kVar) {
        synchronized (this.d) {
            try {
                oen0 oen0Var = this.r;
                if (oen0Var == null) {
                    oen0 oen0Var2 = ij41.a;
                    oen0Var = new oen0();
                    this.r = oen0Var;
                }
                oen0Var.a(h4kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.v3k
    public final uhd w(g030 g030Var) {
        return this.c.E(g030Var);
    }

    @Override // p.v3k
    public final void z(h4k h4kVar) {
        synchronized (this.d) {
            if (this.g.remove(h4kVar)) {
                this.h = null;
            }
            this.j.k(h4kVar);
            this.k.remove(h4kVar);
        }
    }
}
