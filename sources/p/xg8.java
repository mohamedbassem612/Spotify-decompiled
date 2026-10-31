package p;

import android.content.Context;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xg8 implements d021 {
    public final /* synthetic */ jc9 a;
    public final /* synthetic */ rpv0 b;
    public final qw21 c;
    public final mta d;
    public final ne e;
    public final xav0 f;
    public final q8n g;
    public final short h;
    public final rm5 i;
    public final ewn0 j;
    public long k;
    public final boolean l;
    public final idd1 m;

    public xg8(ne neVar, cxc cxcVar, lmw lmwVar, hm61 hm61Var) {
        pz11 pz11Var = hm61Var.b;
        pw21 pw21Var = qw21.a;
        ne neVarB = sqe.B(cxcVar);
        pw21Var.getClass();
        qw21 qw21VarA = pw21.a(neVarB);
        mta mtaVar = new mta((byte) 2);
        xav0 xav0Var = hm61Var.c;
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        this.a = t9w.a(neVar);
        this.b = kc20.a(neVar);
        this.c = qw21VarA;
        this.d = mtaVar;
        this.e = neVar;
        this.f = xav0Var;
        this.g = b3sVar;
        this.h = (short) 500;
        this.i = new rm5(neVar, new aq80(lmwVar, pz11Var, xav0Var, (byte) 0));
        this.j = new ewn0(lmwVar, (byte) 2);
        this.l = qtw0.a.contains("com.spotify.music");
        this.m = new idd1(new q30(this, (byte) 23));
    }

    @Override // p.d021
    public final Single a() {
        ne neVar = this.e;
        neVar.getClass();
        return Single.fromCallable(new w0c1(neVar, (byte) 0)).subscribeOn(Schedulers.c);
    }

    @Override // p.d021
    public final Single b(x020 x020Var) {
        long jW = this.d.w();
        long millis = TimeUnit.SECONDS.toMillis(((c021) this.m.getValue()).a());
        if (x020Var == x020.e && jW - this.k < millis) {
            return Single.just(d020.a);
        }
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o(f4i1.f("Fetching remote config data (", x020Var.name(), ")"), new Object[0]);
        return rqt0.F(this.g, new wn2(this, x020Var, jW, (lnm) null, (byte) 2));
    }

    @Override // p.d021
    public final void c(Context context) {
        z5p1.q(context.getApplicationContext());
    }

    @Override // p.d021
    public final Completable d() {
        return b(x020.e).ignoreElement();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object e(x020 x020Var, long j, onm onmVar) {
        vg8 vg8Var;
        ResolveRequest resolveRequestA;
        Object objJ;
        long j2;
        x020 x020Var2;
        String str;
        long jW;
        mta mtaVar;
        x020 x020Var3;
        long j3;
        long j4;
        long j5;
        g020 g020VarO;
        if (onmVar instanceof vg8) {
            vg8Var = (vg8) onmVar;
            int i = vg8Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg8Var.g = i - Integer.MIN_VALUE;
            } else {
                vg8Var = new vg8(this, onmVar);
            }
        } else {
            vg8Var = new vg8(this, onmVar);
        }
        vg8 vg8Var2 = vg8Var;
        Object objA = vg8Var2.e;
        int i2 = vg8Var2.g;
        rm5 rm5Var = this.i;
        mta mtaVar2 = this.d;
        d9n d9nVar = d9n.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        hm5.M(objA);
                        resolveRequestA = otk.a(x020Var, this.f);
                        utw0 utw0Var = ike1.a;
                        utw0Var.y("RCS");
                        utw0Var.z(String.valueOf(resolveRequestA), new Object[0]);
                        ne neVar = this.e;
                        neVar.getClass();
                        Single singleCreate = Single.create(new tpb(neVar));
                        vg8Var2.a = x020Var;
                        vg8Var2.b = resolveRequestA;
                        vg8Var2.c = j;
                        vg8Var2.g = 1;
                        objJ = fc11.j(singleCreate, vg8Var2);
                        if (objJ != d9nVar) {
                            j2 = j;
                            x020Var2 = x020Var;
                        }
                        return d9nVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = vg8Var2.d;
                        j5 = vg8Var2.c;
                        x020Var3 = vg8Var2.a;
                        try {
                            hm5.M(objA);
                            mtaVar = mtaVar2;
                            try {
                                sy21 sy21Var = (sy21) objA;
                                rm5Var.D(mtaVar.w() - j3, x020Var3, sy21Var);
                                g020VarO = this.a.o(sy21Var);
                                if (!g020VarO.equals(e020.a) && sy21Var.a.d != 429) {
                                    return g020VarO;
                                }
                                this.k = j5;
                                return g020VarO;
                            } catch (Exception e) {
                                e = e;
                                rm5Var.F(e, x020Var3, mtaVar.w() - j3);
                                return c020.a;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            mtaVar = mtaVar2;
                            rm5Var.F(e, x020Var3, mtaVar.w() - j3);
                            return c020.a;
                        }
                    }
                    long j6 = vg8Var2.c;
                    ResolveRequest resolveRequest = vg8Var2.b;
                    x020 x020Var4 = vg8Var2.a;
                    hm5.M(objA);
                    j2 = j6;
                    x020Var2 = x020Var4;
                    objJ = objA;
                    resolveRequestA = resolveRequest;
                    l24 l24Var = new l24(this, resolveRequestA, str, (lnm) null, (byte) 2);
                    vg8Var2.a = x020Var2;
                    vg8Var2.b = null;
                    vg8Var2.c = j2;
                    vg8Var2.d = jW;
                    vg8Var2.g = 2;
                    objA = e8d1.a(5, j4, l24Var, vg8Var2);
                    if (objA != d9nVar) {
                        x020Var3 = x020Var2;
                        j5 = j2;
                        j3 = jW;
                        sy21 sy21Var2 = (sy21) objA;
                        rm5Var.D(mtaVar.w() - j3, x020Var3, sy21Var2);
                        g020VarO = this.a.o(sy21Var2);
                        if (!g020VarO.equals(e020.a)) {
                            return g020VarO;
                        }
                        this.k = j5;
                        return g020VarO;
                    }
                    return d9nVar;
                } catch (Exception e3) {
                    e = e3;
                    x020Var3 = x020Var2;
                    j3 = jW;
                    rm5Var.F(e, x020Var3, mtaVar.w() - j3);
                    return c020.a;
                }
                mtaVar = mtaVar2;
                j4 = this.h;
            } catch (Exception e4) {
                e = e4;
                mtaVar = mtaVar2;
            }
            String str2 = (String) objJ;
            str2.getClass();
            if (str2.length() <= 0) {
                objJ = null;
            }
            str = (String) objJ;
            jW = mtaVar2.w();
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(x020 x020Var, onm onmVar) {
        wg8 wg8Var;
        Exception exc;
        long j;
        x020 x020Var2;
        if (onmVar instanceof wg8) {
            wg8Var = (wg8) onmVar;
            int i = wg8Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg8Var.e = i - Integer.MIN_VALUE;
            } else {
                wg8Var = new wg8(this, onmVar);
            }
        } else {
            wg8Var = new wg8(this, onmVar);
        }
        Object objA = wg8Var.c;
        int i2 = wg8Var.e;
        mta mtaVar = this.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                String strL = cyo1.l(((kvw0) this.e.e).a());
                long jW = mtaVar.w();
                try {
                    long j2 = this.h;
                    i24 i24Var = new i24(this, strL, (lnm) null, (byte) 7);
                    wg8Var.a = x020Var;
                    wg8Var.b = jW;
                    wg8Var.e = 1;
                    objA = e8d1.a(5, j2, i24Var, wg8Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    j = jW;
                    x020Var2 = x020Var;
                    sy21 sy21Var = (sy21) objA;
                    this.j.d(sy21Var, this.b.i(sy21Var), x020Var2, mtaVar.w() - j);
                } catch (Exception e) {
                    exc = e;
                    j = jW;
                    this.j.c(exc, x020Var, mtaVar.w() - j);
                    return rih1.a;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = wg8Var.b;
                x020Var = wg8Var.a;
                try {
                    hm5.M(objA);
                    x020Var2 = x020Var;
                    try {
                        sy21 sy21Var2 = (sy21) objA;
                        try {
                            this.j.d(sy21Var2, this.b.i(sy21Var2), x020Var2, mtaVar.w() - j);
                        } catch (Exception e2) {
                            exc = e2;
                            x020Var = x020Var2;
                            this.j.c(exc, x020Var, mtaVar.w() - j);
                        }
                    } catch (Exception e3) {
                        exc = e3;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    this.j.c(exc, x020Var, mtaVar.w() - j);
                    return rih1.a;
                }
            }
            return rih1.a;
        } catch (CancellationException e5) {
            throw e5;
        }
    }
}
