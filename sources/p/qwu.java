package p;

import android.os.Handler;
import android.util.SparseIntArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qwu {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final zws f123p;
    public final soh0 a;
    public final qba b;
    public final int c;
    public final exs d;
    public final wcr e;
    public final SparseIntArray f;
    public final Handler g;
    public boolean h;
    public boolean i;
    public mxr j;
    public pwu k;
    public qnf1[] l;
    public kqg0[] m;
    public List[][] n;
    public List[][] o;

    static {
        zws zwsVar = zws.F0;
        zwsVar.getClass();
        yws ywsVar = new yws(zwsVar);
        ywsVar.G = true;
        ywsVar.N = false;
        f123p = new zws(ywsVar);
    }

    public qwu(yoh0 yoh0Var, qba qbaVar, zws zwsVar, wcr wcrVar) {
        int i;
        soh0 soh0Var = yoh0Var.b;
        soh0Var.getClass();
        this.a = soh0Var;
        this.b = qbaVar;
        if (qbaVar == null) {
            i = 0;
        } else {
            i = qbaVar instanceof akx0 ? 1 : 2;
        }
        this.c = i;
        exs exsVar = new exs(zwsVar, new sjb((byte) 8), null);
        this.d = exsVar;
        this.e = wcrVar;
        this.f = new SparseIntArray();
        thn thnVar = new thn(exsVar, (byte) 14);
        dm5.y(exsVar.a == null);
        exsVar.a = thnVar;
        exsVar.b = o4a.l;
        exsVar.g = exsVar.f;
        this.g = zoi1.s((Handler.Callback) null);
    }

    public final void a(int i, zws zwsVar) {
        exs exsVar = this.d;
        exsVar.p(zwsVar);
        f(i);
        mjh1 mjh1VarK = zwsVar.H.o().k();
        while (mjh1VarK.hasNext()) {
            h0g1 h0g1Var = (h0g1) mjh1VarK.next();
            yws ywsVar = new yws(zwsVar);
            ywsVar.f(h0g1Var);
            exsVar.p(ywsVar.b());
            f(i);
        }
    }

    public final void b() {
        dm5.y(this.c == 2);
        dm5.y(this.h);
        dm5.y(this.i);
    }

    public final int c() {
        int i = this.c;
        if (i == 0) {
            return 0;
        }
        dm5.y(i != 0);
        dm5.y(this.h);
        return this.k.t.length;
    }

    public final void d() {
        this.k.getClass();
        this.k.t.getClass();
        this.k.h.getClass();
        boolean z = false;
        int i = this.c;
        if (i == 2) {
            int length = this.k.t.length;
            int length2 = ((jca[]) this.e.b).length;
            this.n = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
            this.o = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < length2; i3++) {
                    this.n[i2][i3] = new ArrayList();
                    this.o[i2][i3] = Collections.unmodifiableList(this.n[i2][i3]);
                }
            }
            this.l = new qnf1[length];
            this.m = new kqg0[length];
            for (int i4 = 0; i4 < length; i4++) {
                this.l[i4] = this.k.t[i4].u();
                kqg0 kqg0Var = (kqg0) f(i4).f;
                this.d.c = kqg0Var;
                kqg0[] kqg0VarArr = this.m;
                kqg0Var.getClass();
                kqg0VarArr[i4] = kqg0Var;
            }
            this.h = true;
            this.i = true;
            z = true;
        } else {
            dm5.y(i == 1);
            this.k.i.getClass();
            this.h = true;
        }
        this.g.post(new s38((Object) this, z, (byte) 3));
    }

    public final void e() {
        pwu pwuVar = this.k;
        if (pwuVar != null && !pwuVar.X) {
            pwuVar.X = true;
            pwuVar.g.sendEmptyMessage(4);
        }
        this.d.k();
        for (jca jcaVar : (jca[]) this.e.b) {
            jcaVar.H();
        }
    }

    public final o0g1 f(int i) {
        o0g1 o0g1VarN = this.d.n(this.e.b(), this.l[i], new p2i0(this.k.h.l(i)), this.k.h);
        byte b = 0;
        for (int i2 = 0; i2 < o0g1VarN.b; i2++) {
            qp00 qp00Var = ((qp00[]) o0g1VarN.d)[i2];
            if (qp00Var != null) {
                List list = this.n[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        list.add(qp00Var);
                        break;
                    }
                    qp00 qp00Var2 = (qp00) list.get(i3);
                    if (qp00Var2.n().equals(qp00Var.n())) {
                        SparseIntArray sparseIntArray = this.f;
                        sparseIntArray.clear();
                        for (int i4 = 0; i4 < qp00Var2.length(); i4++) {
                            sparseIntArray.put(qp00Var2.f(i4), 0);
                        }
                        for (int i5 = 0; i5 < qp00Var.length(); i5++) {
                            sparseIntArray.put(qp00Var.f(i5), 0);
                        }
                        int[] iArr = new int[sparseIntArray.size()];
                        for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                            iArr[i6] = sparseIntArray.keyAt(i6);
                        }
                        list.set(i3, new nwu(qp00Var2.n(), iArr, yca.g, b));
                        break;
                    }
                    i3++;
                }
            }
        }
        return o0g1VarN;
    }
}
