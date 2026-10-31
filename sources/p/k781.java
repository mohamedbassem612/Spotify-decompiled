package p;

import android.net.Uri;
import android.text.TextUtils;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k781 {
    public final vyq0 A;
    public final l2a B;
    public final r781 a;
    public final suu b;
    public final x1v c;
    public final zxm1 d;
    public final k5q e;
    public final l5q f;
    public final bl3 g;
    public final boolean h;
    public final boolean i;
    public final y4q j;
    public final rsz0 k;
    public final brz0 l;
    public final b221 m;
    public final xrc0 n;
    public final xlo o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f771 f38p;
    public final u35 q;
    public final ogr r;
    public final a680 s;
    public final gmt t;
    public final o860 u;
    public final go41 v;
    public final kqi0 w;
    public final q8n x;
    public final r9b y;
    public final u9b z;

    public k781(r781 r781Var, suu suuVar, x1v x1vVar, zxm1 zxm1Var, k5q k5qVar, l5q l5qVar, bl3 bl3Var, boolean z, boolean z2, y4q y4qVar, rsz0 rsz0Var, brz0 brz0Var, b221 b221Var, xrc0 xrc0Var, xlo xloVar, f771 f771Var, u35 u35Var, ogr ogrVar, a680 a680Var, gmt gmtVar, o860 o860Var, go41 go41Var, kqi0 kqi0Var, q8n q8nVar, r9b r9bVar, u9b u9bVar, vyq0 vyq0Var, l2a l2aVar) {
        this.a = r781Var;
        this.b = suuVar;
        this.c = x1vVar;
        this.d = zxm1Var;
        this.e = k5qVar;
        this.f = l5qVar;
        this.g = bl3Var;
        this.h = z;
        this.i = z2;
        this.j = y4qVar;
        this.k = rsz0Var;
        this.l = brz0Var;
        this.m = b221Var;
        this.n = xrc0Var;
        this.o = xloVar;
        this.f38p = f771Var;
        this.q = u35Var;
        this.r = ogrVar;
        this.s = a680Var;
        this.t = gmtVar;
        this.u = o860Var;
        this.v = go41Var;
        this.w = kqi0Var;
        this.x = q8nVar;
        this.y = r9bVar;
        this.z = u9bVar;
        this.A = vyq0Var;
        this.B = l2aVar;
    }

    public final Observable a(String str, lik1 lik1Var, l781 l781Var) {
        Observable observableI;
        String str2;
        String str3 = lik1Var.a;
        boolean z = l781Var.n;
        o6x o6xVar = o6x.a;
        if (z) {
            brz0 brz0Var = this.l;
            observableI = yoi1.i(new x010(brz0Var.a.c(1, str), brz0Var.b.a, new arz0(3, (lnm) null), (byte) 1), o6xVar);
        } else {
            observableI = yoi1.i(this.k.a, o6xVar);
        }
        Observable observable = observableI;
        Set set = s4b1.f;
        boolean zI = uic.i(str3, s4b1.g);
        rsc0 rsc0Var = this.n;
        Observable observableJust = ((!zI && !uic.g(str3, blc0.Yc)) || (str2 = l781Var.a) == null || ihc1.y0(str2)) ? Observable.just(j5.a) : Observable.combineLatest(rqt0.F(this.x, new p651(this, lik1Var, str, l781Var, (lnm) null, (byte) 16)).toObservable().onErrorReturn(u9x0.X), yoi1.i(new tu41(rsc0Var.p(new rxc0(str3)), (byte) 19), o6xVar), vbx0.Y);
        observableJust.getClass();
        return Observable.combineLatest(this.a.f(str), this.c.b(str, false), this.d.b(str, lik1Var), this.g.g(str).toObservable(), observable, this.m.a(str), yoi1.i(new tu41(rsc0Var.p(new rxc0(str)), (byte) 19), o6xVar), observableJust, yoi1.i(this.y.a(str), o6xVar), s9x0.Y).flatMapSingle(new r961(this, lik1Var, l781Var, (byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x0851  */
    /* JADX WARN: Code duplicated, block: B:140:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:141:0x0904  */
    /* JADX WARN: Code duplicated, block: B:143:0x090c  */
    /* JADX WARN: Code duplicated, block: B:151:0x096e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0992  */
    /* JADX WARN: Code duplicated, block: B:156:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:158:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:159:0x09af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:161:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:164:0x09be  */
    /* JADX WARN: Code duplicated, block: B:165:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:168:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:171:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:174:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:177:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:179:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:180:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:185:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:189:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:196:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:203:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:204:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:209:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:212:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:214:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:216:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:219:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:222:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:224:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:225:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:229:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0b18 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0b9e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:247:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:281:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:284:0x0cbc  */
    /* JADX WARN: Code duplicated, block: B:286:0x0cc9  */
    /* JADX WARN: Code duplicated, block: B:290:0x0cd1  */
    /* JADX WARN: Code duplicated, block: B:291:0x0ce1  */
    /* JADX WARN: Code duplicated, block: B:293:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:295:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:296:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:298:0x0cf2  */
    /* JADX WARN: Code duplicated, block: B:299:0x0cf5  */
    /* JADX WARN: Code duplicated, block: B:301:0x0cf8  */
    /* JADX WARN: Code duplicated, block: B:303:0x0cff  */
    /* JADX WARN: Code duplicated, block: B:314:0x0dbd  */
    /* JADX WARN: Code duplicated, block: B:319:0x0dcf  */
    /* JADX WARN: Code duplicated, block: B:321:0x0dd3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:323:0x0de9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x0deb  */
    /* JADX WARN: Code duplicated, block: B:326:0x0dfe  */
    /* JADX WARN: Code duplicated, block: B:329:0x0e17  */
    /* JADX WARN: Code duplicated, block: B:331:0x0e1d  */
    /* JADX WARN: Code duplicated, block: B:335:0x0e25  */
    /* JADX WARN: Code duplicated, block: B:338:0x0e32  */
    /* JADX WARN: Code duplicated, block: B:339:0x0e37  */
    /* JADX WARN: Code duplicated, block: B:341:0x0e3d  */
    /* JADX WARN: Code duplicated, block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x078e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0796  */
    /* JADX WARN: Code duplicated, block: B:98:0x07aa  */
    public final Object b(q781 q781Var, lik1 lik1Var, vum1 vum1Var, l781 l781Var, v1v v1vVar, kk3 kk3Var, boolean z, c221 c221Var, g781 g781Var, who0 who0Var, boolean z2, onm onmVar) {
        i781 i781Var;
        boolean zS;
        int i;
        boolean z3;
        String strA;
        mq70 mq70Var;
        up70 up70VarA;
        s24 s24Var;
        s24 s24Var2;
        d520 d520Var;
        lik1 lik1Var2;
        d520 d520Var2;
        l781 l781Var2;
        v1v v1vVar2;
        c221 c221Var2;
        g781 g781Var2;
        who0 who0Var2;
        d520 d520Var3;
        i781 i781Var2;
        umb umbVar;
        boolean z4;
        d9n d9nVar;
        String str;
        igm igmVar;
        List list;
        s24 s24Var3;
        vum1 vum1Var2;
        Object obj;
        String str2;
        boolean z5;
        ArrayList arrayList;
        String str3;
        q781 q781Var2;
        l781 l781Var3;
        v1v v1vVar3;
        c221 c221Var3;
        g781 g781Var3;
        who0 who0Var3;
        d520 d520Var4;
        String str4;
        d9n d9nVar2;
        boolean z6;
        vum1 vum1Var3;
        String str5;
        s24 s24Var4;
        boolean z7;
        vum1 vum1Var4;
        String str6;
        String str7;
        s24 s24Var5;
        Object obj2;
        List list2;
        boolean z8;
        a821 a821Var;
        v1v v1vVar4;
        boolean z9;
        boolean z10;
        vum1 vum1Var5;
        boolean z11;
        q781 q781Var3;
        l781 l781Var4;
        d520 d520Var5;
        who0 who0Var4;
        String str8;
        lik1 lik1Var3;
        g781 g781Var4;
        c221 c221Var4;
        String str9;
        boolean z12;
        w281 w281VarO;
        igm igmVar2;
        boolean z13;
        e2t0 e2t0Var;
        q781 q781Var4;
        String str10;
        lik1 lik1Var4;
        i781 i781Var3;
        ugo0 ugo0Var;
        p860 p860Var;
        String str11;
        q781 q781Var5;
        i781 i781Var4;
        lik1 lik1Var5;
        g781 g781Var5;
        String str12;
        boolean z14;
        boolean z15;
        d520 d520Var6;
        Object objA;
        d9n d9nVar3;
        l781 l781Var5;
        s24 s24Var6;
        Object obj3;
        d9n d9nVar4;
        lik1 lik1Var6;
        boolean z16;
        List list3;
        d520 d520Var7;
        boolean z17;
        igm igmVar3;
        String str13;
        q781 q781Var6;
        jhm jhmVarS;
        w281 w281VarO2;
        umb umbVarS;
        xwp0 xwp0Var;
        w281 w281VarO3;
        umb umbVarS2;
        boolean z18;
        umx umxVar;
        int i2;
        hhm hhmVar;
        boolean zBooleanValue;
        jf4 jf4Var;
        cd8 cd8VarM;
        ok51 ok51Var;
        boolean z19;
        q781 q781Var7;
        igm igmVar4;
        boolean z20;
        lik1 lik1Var7;
        List list4;
        c98 c98Var;
        x88 x88Var;
        b98 b98Var;
        boolean z21;
        boolean z22;
        q781 q781Var8;
        boolean z23;
        igm igmVar5;
        l781 l781Var6;
        lik1 lik1Var8;
        List list5;
        List list6;
        boolean z24;
        String str14;
        boolean z25;
        List list7;
        String str15;
        String strA2;
        mq70 mq70Var2;
        up70 up70VarA2;
        x7i1 x7i1Var;
        u35 u35Var;
        boolean zJ;
        exc0 exc0Var;
        k781 k781Var = this;
        if (onmVar instanceof i781) {
            i781Var = (i781) onmVar;
            int i3 = i781Var.X0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i781Var.X0 = i3 - Integer.MIN_VALUE;
            } else {
                i781Var = new i781(k781Var, onmVar);
            }
        } else {
            i781Var = new i781(k781Var, onmVar);
        }
        i781 i781Var5 = i781Var;
        Object jhmVar = i781Var5.V0;
        int i4 = i781Var5.X0;
        d9n d9nVar5 = d9n.a;
        if (i4 == 0) {
            hm5.M(jhmVar);
            String strQ = w6p1.q(q781Var);
            String strN = w6p1.n(q781Var);
            zS = w6p1.s(q781Var);
            boolean z26 = q781Var instanceof p781;
            if (z26) {
                z3 = ((p781) q781Var).a.w;
                i = 1;
            } else {
                if (!(q781Var instanceof o781)) {
                    eg.o();
                    return null;
                }
                va81 va81Var = ((o781) q781Var).g;
                if (va81Var != null) {
                    i = 1;
                    if (va81Var.j) {
                        z3 = true;
                    }
                } else {
                    i = 1;
                }
                z3 = false;
            }
            if (z26) {
                strA = ((p781) q781Var).a.j.a(i);
            } else {
                if (!(q781Var instanceof o781)) {
                    eg.o();
                    return null;
                }
                xkk1 xkk1Var = ((o781) q781Var).c;
                strA = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
            }
            Uri uri = !TextUtils.isEmpty(strA) ? Uri.parse(strA) : Uri.EMPTY;
            uri.getClass();
            wfm wfmVar = new wfm(uri, zS ? zfm.c : fgm.c);
            l781Var.getClass();
            igm igmVar6 = new igm(strN, wfmVar, w6p1.p(q781Var));
            ArrayList arrayList2 = new ArrayList();
            l5q l5qVar = k781Var.f;
            switch (l5qVar.a) {
                case 0:
                    v5q v5qVar = (v5q) ((thq) l5qVar.b).c;
                    s24Var = new s24((Object) lik1Var, v5qVar.E5.get(), v5qVar.s2.get(), v5qVar.M5.get(), (Object) v5qVar.y0(), (Object) new xj1((lzn0) v5qVar.U0.get()), (Object) v5qVar.c(), (Object) v5qVar.n0(), (Object) v5qVar.I(), (Object) v5qVar.u0(), (Object) v5qVar.h0(), (Object) v5qVar.G0(), (Object) v5qVar.i0(), (byte) 19);
                    s24Var2 = s24Var;
                    break;
                case 1:
                    s7q s7qVar = (s7q) l5qVar.b.d;
                    s24Var = new s24((Object) lik1Var, s7qVar.E3.get(), s7qVar.G3.get(), s7qVar.H3.get(), (Object) s7qVar.B4(), (Object) new xj1((lzn0) s7qVar.U0.get()), (Object) s7qVar.h(), (Object) s7qVar.E3(), (Object) s7qVar.I1(), (Object) s7qVar.o4(), (Object) s7qVar.o3(), (Object) s7qVar.j5(), (Object) s7qVar.p3(), (byte) 19);
                    s24Var2 = s24Var;
                    break;
                default:
                    teq teqVar = l5qVar.b.d;
                    zS = zS;
                    arrayList2 = arrayList2;
                    igmVar6 = igmVar6;
                    z3 = z3;
                    strN = strN;
                    i781Var5 = i781Var5;
                    d9nVar5 = d9nVar5;
                    strQ = strQ;
                    s24Var2 = new s24((Object) lik1Var, teqVar.O3.get(), teqVar.l2.get(), teqVar.P3.get(), (Object) teqVar.s3(), (Object) new xj1((lzn0) teqVar.i.get()), (Object) teqVar.g(), (Object) teqVar.A2(), (Object) teqVar.X0(), (Object) teqVar.m3(), (Object) teqVar.n2(), (Object) teqVar.X3(), (Object) teqVar.o2(), (byte) 19);
                    break;
            }
            k5q k5qVar = k781Var.e;
            switch (k5qVar.a) {
                case 0:
                    v5q v5qVar2 = (v5q) ((thq) k5qVar.b).c;
                    dg30 dg30Var = (dg30) v5qVar2.i.a;
                    z4q z4qVar = (z4q) v5qVar2.S5.get();
                    ayl aylVar = (ayl) v5qVar2.F2.get();
                    daq daqVar = v5qVar2.b;
                    mxr mxrVar = new mxr(dg30Var, z4qVar, aylVar, new mxr(daqVar.y(), (i1r0) v5qVar2.x6.get(), (Scheduler) daqVar.z1.get()));
                    k811 k811VarT0 = v5qVar2.t0();
                    dg30 dg30Var2 = (dg30) v5qVar2.i.a;
                    daq daqVar2 = v5qVar2.b;
                    lik1Var2 = lik1Var;
                    d520Var = new d520(lik1Var2, mxrVar, k811VarT0, new dr41(new r0d1(dg30Var2, (Scheduler) daqVar2.z1.get(), (y390) v5qVar2.e1.get(), (zr00) daqVar2.f9.get(), new r2a1((th30) v5qVar2.R0.get(), new uww0(xqu.a(v5qVar2.N7), (byte) 23), (byte) 26), (lzn0) v5qVar2.U0.get()), (byte) 27), new pmb((dg30) v5qVar2.i.a, (wsg0) v5qVar2.R7.get(), (kt91) daqVar2.f8.get(), (i8h1) daqVar2.A5.get(), (zeu0) daqVar2.C6.get(), (t8u0) daqVar2.d9.get()), new u961((dg30) v5qVar2.i.a, new il1(v5qVar2.b()), (kt91) daqVar2.f8.get(), v5qVar2.I()), new q59((b840) v5qVar2.u6.get(), (lzn0) v5qVar2.U0.get(), (byte) 21), (byte) 19);
                    d520Var2 = d520Var;
                    break;
                case 1:
                    s7q s7qVar2 = (s7q) k5qVar.b.d;
                    dg30 dg30Var3 = (dg30) s7qVar2.t.a;
                    z4q z4qVar2 = (z4q) s7qVar2.j3.get();
                    ayl aylVar2 = (ayl) s7qVar2.l3.get();
                    daq daqVar3 = s7qVar2.b;
                    mxr mxrVar2 = new mxr(dg30Var3, z4qVar2, aylVar2, new mxr(daqVar3.y(), (i1r0) s7qVar2.m3.get(), (Scheduler) daqVar3.z1.get()));
                    k811 k811VarI4 = s7qVar2.i4();
                    dg30 dg30Var4 = (dg30) s7qVar2.t.a;
                    daq daqVar4 = s7qVar2.b;
                    lik1Var2 = lik1Var;
                    d520Var2 = new d520(lik1Var2, mxrVar2, k811VarI4, new dr41(new r0d1(dg30Var4, (Scheduler) daqVar4.z1.get(), (y390) s7qVar2.n3.get(), (zr00) daqVar4.f9.get(), new r2a1((th30) s7qVar2.f2.get(), new uww0(xqu.a(s7qVar2.r3), (byte) 23), (byte) 26), (lzn0) s7qVar2.U0.get()), (byte) 27), new pmb((dg30) s7qVar2.t.a, (wsg0) s7qVar2.v3.get(), (kt91) daqVar4.f8.get(), (i8h1) daqVar4.A5.get(), (zeu0) daqVar4.C6.get(), (t8u0) daqVar4.d9.get()), new u961((dg30) s7qVar2.t.a, new il1(new fl1((w4q) s7qVar2.w3.get(), (byte) 0)), (kt91) daqVar4.f8.get(), s7qVar2.I1()), new q59((b840) s7qVar2.C3.get(), (lzn0) s7qVar2.U0.get(), (byte) 21), (byte) 19);
                    break;
                default:
                    teq teqVar2 = k5qVar.b.d;
                    dg30 dg30Var5 = (dg30) teqVar2.f.a;
                    z4q z4qVar3 = (z4q) teqVar2.w3.get();
                    ayl aylVar3 = (ayl) teqVar2.x3.get();
                    daq daqVar5 = teqVar2.d;
                    mxr mxrVar3 = new mxr(dg30Var5, z4qVar3, aylVar3, new mxr(daqVar5.y(), (i1r0) teqVar2.y3.get(), (Scheduler) daqVar5.z1.get()));
                    k811 k811VarK3 = teqVar2.k3();
                    dg30 dg30Var6 = (dg30) teqVar2.f.a;
                    daq daqVar6 = teqVar2.d;
                    lik1Var2 = lik1Var;
                    d520Var = new d520(lik1Var2, mxrVar3, k811VarK3, new dr41(new r0d1(dg30Var6, (Scheduler) daqVar6.z1.get(), (y390) teqVar2.o3.get(), (zr00) daqVar6.f9.get(), new r2a1((th30) teqVar2.m1.get(), cec1.a(xqu.a(teqVar2.A3)), (byte) 26), (lzn0) teqVar2.i.get()), (byte) 27), new pmb((dg30) teqVar2.f.a, (wsg0) teqVar2.E3.get(), (kt91) daqVar6.f8.get(), (i8h1) daqVar6.A5.get(), (zeu0) daqVar6.C6.get(), (t8u0) daqVar6.d9.get()), teqVar2.e(), new q59((b840) teqVar2.L3.get(), (lzn0) teqVar2.i.get(), (byte) 21), (byte) 19);
                    d520Var2 = d520Var;
                    break;
            }
            if (!zS) {
                l781Var2 = l781Var;
                v1vVar2 = v1vVar;
                c221Var2 = c221Var;
                g781Var2 = g781Var;
                who0Var2 = who0Var;
                d520Var3 = d520Var2;
                ArrayList arrayList3 = arrayList2;
                String str16 = strN;
                igm igmVar7 = igmVar6;
                String str17 = strQ;
                i781Var2 = i781Var5;
                umbVar = null;
                i781Var2.a = q781Var;
                i781Var2.b = lik1Var2;
                i781Var2.c = vum1Var;
                i781Var2.d = l781Var2;
                i781Var2.e = v1vVar2;
                i781Var2.f = c221Var2;
                i781Var2.g = g781Var2;
                i781Var2.h = who0Var2;
                i781Var2.i = str17;
                i781Var2.t = str16;
                i781Var2.X = igmVar7;
                i781Var2.Y = arrayList3;
                i781Var2.Z = s24Var2;
                i781Var2.N0 = d520Var3;
                z4 = z;
                i781Var2.Q0 = z4;
                i781Var2.R0 = z2;
                i781Var2.S0 = zS;
                i781Var2.T0 = z3;
                i781Var2.X0 = 2;
                k781Var = this;
                Object objA2 = k781Var.o.a(str17, i781Var2);
                d9nVar = d9nVar5;
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                str = str16;
                igmVar = igmVar7;
                list = arrayList3;
                s24Var3 = s24Var2;
                vum1Var2 = vum1Var;
                obj = objA2;
                str2 = str17;
                z5 = z2;
                zBooleanValue = ((Boolean) obj).booleanValue();
                l781Var2.getClass();
                if (zBooleanValue) {
                    list.add(((u961) s24Var3.t).t(str2, false, l781Var2.e, w6p1.t(q781Var)));
                }
                if (z5 != 0) {
                    list.add(k781Var.B.g(str2));
                }
                jf4Var = k781Var.z.a;
                if (!jf4Var.v()) {
                }
                v1v v1vVar5 = v1vVar2;
                l781Var4 = l781Var2;
                v1vVar4 = v1vVar5;
                q781Var3 = q781Var;
                lik1Var3 = lik1Var2;
                vum1Var5 = vum1Var2;
                z10 = z4;
                str8 = str2;
                d9nVar2 = d9nVar;
                who0Var4 = who0Var2;
                d520Var5 = d520Var3;
                z11 = zS;
                g781Var4 = g781Var2;
                c221Var4 = c221Var2;
                str9 = str;
                igmVar2 = igmVar;
                z13 = z3;
                boolean z27 = z5;
                if (who0Var4 != null) {
                    list.addAll(k781Var.w.h(lik1Var3.a, str8, l781Var4.a, who0Var4));
                }
                if (z13) {
                    e2t0Var = e2t0.t;
                } else if (z11) {
                    e2t0Var = e2t0.c;
                } else {
                    e2t0Var = e2t0.X;
                }
                if (u890.j(vum1Var5, tum1.a)) {
                    list.add(((dlg1) s24Var3.Z).i(str8, e2t0Var));
                } else if (!u890.j(vum1Var5, uum1.a)) {
                    list.add(((tzr0) s24Var3.i).g(str8, e2t0Var, (lik1) s24Var3.b));
                }
                if (w6p1.s(q781Var3)) {
                    w281VarO2 = w6p1.o(q781Var3);
                    if (w281VarO2 != null) {
                        umbVarS = nln.s(w281VarO2);
                    } else {
                        umbVarS = umbVar;
                    }
                    if (u890.j(umbVarS, tmb.a)) {
                        String strQ2 = w6p1.q(q781Var3);
                        if (q781Var3 instanceof p781) {
                            xwp0Var = ((p781) q781Var3).a.z;
                        } else {
                            if (q781Var3 instanceof o781) {
                                eg.o();
                                return umbVar;
                            }
                            xwp0Var = ((o781) q781Var3).l;
                        }
                        w281VarO3 = w6p1.o(q781Var3);
                        if (w281VarO3 != null) {
                            umbVarS2 = nln.s(w281VarO3);
                        } else {
                            umbVarS2 = umbVar;
                        }
                        mxr mxrVar4 = (mxr) d520Var5.c;
                        lik1 lik1Var9 = (lik1) d520Var5.b;
                        umb umbVar2 = umbVarS2;
                        if (xwp0Var instanceof vwp0) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        xwp0 xwp0Var2 = xwp0Var;
                        drj0 drj0VarA = ((z4q) mxrVar4.b).a(lik1Var9);
                        if (z18) {
                            umxVar = umx.c;
                        } else {
                            umxVar = tmx.c;
                        }
                        umx umxVar2 = umxVar;
                        if (z18) {
                            i2 = 2131954466;
                        } else {
                            i2 = 2131954365;
                        }
                        Integer numValueOf = Integer.valueOf(i2);
                        ygm ygmVar = new ygm(2);
                        if (z18) {
                            hhmVar = hhm.b;
                        } else {
                            hhmVar = hhm.a;
                        }
                        lik1Var4 = lik1Var3;
                        q781Var4 = q781Var3;
                        i781Var3 = i781Var2;
                        str10 = str8;
                        list.add(new jhm("audiobook_download", umxVar2, (fhm) null, numValueOf, (String) null, false, (tm81) null, new ihm(ygmVar, hhmVar, new ghm(wiu.U0, new cl1(z18, strQ2, (byte) 11)), new qi1(mxrVar4, k781Var.b, xwp0Var2, v1vVar4, strQ2, umbVar2, lik1Var9, drj0VarA, (byte) 4)), 244));
                        if (c221Var4.a) {
                            list.add(((k811) d520Var5.d).b(w6p1.q(q781Var4), 0, c221Var4.b));
                        }
                    } else {
                        q781Var4 = q781Var3;
                        str10 = str8;
                        lik1Var4 = lik1Var3;
                        i781Var3 = i781Var2;
                    }
                } else {
                    q781Var4 = q781Var3;
                    str10 = str8;
                    lik1Var4 = lik1Var3;
                    i781Var3 = i781Var2;
                }
                if (l781Var4.f45p) {
                    list.add(k781Var.t.d());
                }
                ugo0Var = l781Var4.i;
                if (ugo0Var != null) {
                    if (ugo0Var.a) {
                        jhmVarS = ((kqi0) s24Var3.Y).k(ugo0Var);
                    } else {
                        jhmVarS = ((dxy) s24Var3.N0).s(ugo0Var);
                    }
                    list.add(jhmVarS);
                }
                p860Var = l781Var4.r;
                if (p860Var != null) {
                    list.add(k781Var.u.h(p860Var));
                }
                if (l781Var4.f) {
                    str11 = str10;
                } else {
                    str11 = str10;
                }
                q781Var5 = q781Var4;
                i781Var4 = i781Var3;
                i781Var4.a = q781Var5;
                lik1Var5 = lik1Var4;
                i781Var4.b = lik1Var5;
                umb umbVar3 = umbVar;
                i781Var4.c = umbVar3;
                i781Var4.d = l781Var4;
                i781Var4.e = umbVar3;
                i781Var4.f = umbVar3;
                g781Var5 = g781Var4;
                i781Var4.g = g781Var5;
                i781Var4.h = umbVar3;
                i781Var4.i = str11;
                str12 = str9;
                i781Var4.t = str12;
                i781Var4.X = igmVar2;
                i781Var4.Y = list;
                i781Var4.Z = s24Var3;
                i781Var4.N0 = d520Var5;
                i781Var4.O0 = umbVar3;
                z14 = z10;
                i781Var4.Q0 = z14;
                z15 = z27;
                i781Var4.R0 = z15;
                i781Var4.S0 = z11;
                i781Var4.T0 = z13;
                d520Var6 = d520Var5;
                i781Var4.X0 = 3;
                objA = k781Var.f38p.a(str11, i781Var4);
                d9nVar3 = d9nVar2;
                if (objA == d9nVar3) {
                    return d9nVar3;
                }
                s24 s24Var7 = s24Var3;
                l781Var5 = l781Var4;
                s24Var6 = s24Var7;
                obj3 = objA;
                d9nVar4 = d9nVar3;
                lik1Var6 = lik1Var5;
                z16 = z13;
                list3 = list;
                d520Var7 = d520Var6;
                z17 = z14;
                igmVar3 = igmVar2;
                str13 = str11;
                q781Var6 = q781Var5;
                boolean z28 = z16;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                if (l781Var5.c) {
                }
                cd8VarM = w6p1.m(q781Var6);
                if (cd8VarM == null) {
                }
                ok51Var = l781Var5.j;
                if (ok51Var != null) {
                    list3.add(((dc31) s24Var6.f).d(ok51Var));
                }
                if (z11 != 0) {
                    if (q781Var6 instanceof p781) {
                        c98Var = (c98) ((p781) q781Var6).a.y.a(c98.class);
                    } else {
                        if (!(q781Var6 instanceof o781)) {
                            eg.o();
                            return null;
                        }
                        c98Var = ((o781) q781Var6).i;
                    }
                    if (c98Var != null) {
                        x88Var = c98Var.a;
                    } else {
                        x88Var = null;
                    }
                    if (x88Var != null) {
                        b98Var = x88Var.c;
                    } else {
                        b98Var = null;
                    }
                    if (x88Var != null) {
                        String str18 = x88Var.b;
                        if (!x88Var.a) {
                        }
                    }
                }
                z19 = z11;
                q781Var7 = q781Var6;
                igmVar4 = igmVar3;
                z20 = zBooleanValue2;
                lik1Var7 = lik1Var6;
                list4 = list3;
                if (l781Var5.d) {
                    if (!k781Var.h) {
                        if (z19) {
                            list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                        }
                    } else if (z19) {
                        list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                    }
                }
                if (z20) {
                    list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
                }
                x7i1Var = g781Var5.a;
                u35Var = k781Var.q;
                if (u35Var.k()) {
                    exc0Var = x7i1Var.g;
                    if (exc0Var.a) {
                        list4.add(k781Var.r.I(str13));
                    } else {
                        list4.add(k781Var.r.I(str13));
                    }
                }
                if (g781Var5.c) {
                    zJ = u35Var.g();
                } else {
                    zJ = u35Var.j();
                }
                if (zJ) {
                    list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
                }
                return new kjm(igmVar4, list4, 4);
            }
            zwg zwgVarA = k781Var.j.a(lik1Var2);
            if ((kk3Var instanceof gk3) || w6p1.t(q781Var) || w6p1.u(q781Var)) {
                arrayList = arrayList2;
                str3 = strQ;
            } else {
                str3 = strQ;
                jhm jhmVarL = zwgVarA.l(str3, lik1Var2.a, kk3Var);
                arrayList = arrayList2;
                if (jhmVarL != null) {
                    arrayList.add(jhmVarL);
                }
            }
            if (w6p1.t(q781Var) && !w6p1.u(q781Var)) {
                arrayList.add(zwgVarA.o(str3));
            }
            if (w6p1.u(q781Var)) {
                q781Var2 = q781Var;
                i781Var2 = i781Var5;
                i781Var2.a = q781Var2;
                i781Var2.b = lik1Var2;
                vum1Var4 = vum1Var;
                i781Var2.c = vum1Var4;
                l781Var3 = l781Var;
                i781Var2.d = l781Var3;
                v1vVar3 = v1vVar;
                i781Var2.e = v1vVar3;
                c221Var3 = c221Var;
                i781Var2.f = c221Var3;
                g781Var3 = g781Var;
                i781Var2.g = g781Var3;
                who0Var3 = who0Var;
                i781Var2.h = who0Var3;
                i781Var2.i = str3;
                String str19 = strN;
                i781Var2.t = str19;
                igm igmVar8 = igmVar6;
                i781Var2.X = igmVar8;
                i781Var2.Y = arrayList;
                i781Var2.Z = s24Var2;
                i781Var2.N0 = d520Var2;
                i781Var2.O0 = arrayList;
                i781Var2.Q0 = z;
                i781Var2.R0 = z2;
                i781Var2.S0 = zS;
                i781Var2.T0 = z3;
                i781Var2.X0 = 1;
                Object objS = ((u961) d520Var2.g).s(str3, i781Var2);
                d520Var4 = d520Var2;
                d9nVar2 = d9nVar5;
                if (objS == d9nVar2) {
                    return d9nVar2;
                }
                str6 = str3;
                str7 = str19;
                igmVar = igmVar8;
                z7 = z2;
                list = arrayList;
                s24Var5 = s24Var2;
                obj2 = objS;
                list2 = list;
                z8 = z;
                list2.add(obj2);
                z6 = z8;
                vum1Var3 = vum1Var4;
                s24Var4 = s24Var5;
                str4 = str7;
                str5 = str6;
            } else {
                q781Var2 = q781Var;
                l781Var3 = l781Var;
                v1vVar3 = v1vVar;
                c221Var3 = c221Var;
                g781Var3 = g781Var;
                who0Var3 = who0Var;
                d520Var4 = d520Var2;
                str4 = strN;
                i781Var2 = i781Var5;
                d9nVar2 = d9nVar5;
                z6 = z;
                vum1Var3 = vum1Var;
                str5 = str3;
                s24Var4 = s24Var2;
                igmVar = igmVar6;
                z7 = z2;
                list = arrayList;
            }
            d520 d520Var8 = d520Var4;
            boolean z29 = zS;
            a821Var = l781Var3.h;
            z5 = z7;
            String str20 = l781Var3.a;
            v1vVar4 = v1vVar3;
            if (a821Var instanceof a821) {
                umbVar = null;
            } else {
                umbVar = null;
            }
            if (l781Var3.k != 1) {
                list.add(((kr60) s24Var4.h).e((lik1) s24Var4.b, str5, lik1Var2.a, true));
            }
            if (w6p1.u(q781Var2)) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (!l781Var3.m) {
            }
            k781Var = this;
            z10 = z6;
            vum1Var5 = vum1Var3;
            z11 = z29;
            q781Var3 = q781Var2;
            l781Var4 = l781Var3;
            d520Var5 = d520Var8;
            who0Var4 = who0Var3;
            str8 = str5;
            lik1Var3 = lik1Var2;
            g781Var4 = g781Var3;
            c221Var4 = c221Var3;
            str9 = str4;
            s24Var3 = s24Var4;
            igmVar2 = igmVar;
            z13 = z3;
            boolean z210 = z5;
            if (who0Var4 != null) {
                list.addAll(k781Var.w.h(lik1Var3.a, str8, l781Var4.a, who0Var4));
            }
            if (z13) {
                e2t0Var = e2t0.t;
            } else if (z11) {
                e2t0Var = e2t0.c;
            } else {
                e2t0Var = e2t0.X;
            }
            if (u890.j(vum1Var5, tum1.a)) {
                list.add(((dlg1) s24Var3.Z).i(str8, e2t0Var));
            } else if (!u890.j(vum1Var5, uum1.a)) {
                list.add(((tzr0) s24Var3.i).g(str8, e2t0Var, (lik1) s24Var3.b));
            }
            if (w6p1.s(q781Var3)) {
                q781Var4 = q781Var3;
                str10 = str8;
                lik1Var4 = lik1Var3;
                i781Var3 = i781Var2;
            } else {
                w281VarO2 = w6p1.o(q781Var3);
                if (w281VarO2 != null) {
                    umbVarS = nln.s(w281VarO2);
                } else {
                    umbVarS = umbVar;
                }
                if (u890.j(umbVarS, tmb.a)) {
                    String strQ3 = w6p1.q(q781Var3);
                    if (q781Var3 instanceof p781) {
                        xwp0Var = ((p781) q781Var3).a.z;
                    } else {
                        if (q781Var3 instanceof o781) {
                            eg.o();
                            return umbVar;
                        }
                        xwp0Var = ((o781) q781Var3).l;
                    }
                    w281VarO3 = w6p1.o(q781Var3);
                    if (w281VarO3 != null) {
                        umbVarS2 = nln.s(w281VarO3);
                    } else {
                        umbVarS2 = umbVar;
                    }
                    mxr mxrVar5 = (mxr) d520Var5.c;
                    lik1 lik1Var10 = (lik1) d520Var5.b;
                    umb umbVar4 = umbVarS2;
                    if (xwp0Var instanceof vwp0) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    xwp0 xwp0Var3 = xwp0Var;
                    drj0 drj0VarA2 = ((z4q) mxrVar5.b).a(lik1Var10);
                    if (z18) {
                        umxVar = umx.c;
                    } else {
                        umxVar = tmx.c;
                    }
                    umx umxVar3 = umxVar;
                    if (z18) {
                        i2 = 2131954466;
                    } else {
                        i2 = 2131954365;
                    }
                    Integer numValueOf2 = Integer.valueOf(i2);
                    ygm ygmVar2 = new ygm(2);
                    if (z18) {
                        hhmVar = hhm.b;
                    } else {
                        hhmVar = hhm.a;
                    }
                    lik1Var4 = lik1Var3;
                    q781Var4 = q781Var3;
                    i781Var3 = i781Var2;
                    str10 = str8;
                    list.add(new jhm("audiobook_download", umxVar3, (fhm) null, numValueOf2, (String) null, false, (tm81) null, new ihm(ygmVar2, hhmVar, new ghm(wiu.U0, new cl1(z18, strQ3, (byte) 11)), new qi1(mxrVar5, k781Var.b, xwp0Var3, v1vVar4, strQ3, umbVar4, lik1Var10, drj0VarA2, (byte) 4)), 244));
                    if (c221Var4.a) {
                        list.add(((k811) d520Var5.d).b(w6p1.q(q781Var4), 0, c221Var4.b));
                    }
                } else {
                    q781Var4 = q781Var3;
                    str10 = str8;
                    lik1Var4 = lik1Var3;
                    i781Var3 = i781Var2;
                }
            }
            if (l781Var4.f45p) {
                list.add(k781Var.t.d());
            }
            ugo0Var = l781Var4.i;
            if (ugo0Var != null) {
                if (ugo0Var.a) {
                    jhmVarS = ((kqi0) s24Var3.Y).k(ugo0Var);
                } else {
                    jhmVarS = ((dxy) s24Var3.N0).s(ugo0Var);
                }
                list.add(jhmVarS);
            }
            p860Var = l781Var4.r;
            if (p860Var != null) {
                list.add(k781Var.u.h(p860Var));
            }
            if (l781Var4.f) {
                str11 = str10;
            } else {
                str11 = str10;
            }
            q781Var5 = q781Var4;
            i781Var4 = i781Var3;
            i781Var4.a = q781Var5;
            lik1Var5 = lik1Var4;
            i781Var4.b = lik1Var5;
            umb umbVar5 = umbVar;
            i781Var4.c = umbVar5;
            i781Var4.d = l781Var4;
            i781Var4.e = umbVar5;
            i781Var4.f = umbVar5;
            g781Var5 = g781Var4;
            i781Var4.g = g781Var5;
            i781Var4.h = umbVar5;
            i781Var4.i = str11;
            str12 = str9;
            i781Var4.t = str12;
            i781Var4.X = igmVar2;
            i781Var4.Y = list;
            i781Var4.Z = s24Var3;
            i781Var4.N0 = d520Var5;
            i781Var4.O0 = umbVar5;
            z14 = z10;
            i781Var4.Q0 = z14;
            z15 = z210;
            i781Var4.R0 = z15;
            i781Var4.S0 = z11;
            i781Var4.T0 = z13;
            d520Var6 = d520Var5;
            i781Var4.X0 = 3;
            objA = k781Var.f38p.a(str11, i781Var4);
            d9nVar3 = d9nVar2;
            if (objA == d9nVar3) {
                return d9nVar3;
            }
            s24 s24Var8 = s24Var3;
            l781Var5 = l781Var4;
            s24Var6 = s24Var8;
            obj3 = objA;
            d9nVar4 = d9nVar3;
            lik1Var6 = lik1Var5;
            z16 = z13;
            list3 = list;
            d520Var7 = d520Var6;
            z17 = z14;
            igmVar3 = igmVar2;
            str13 = str11;
            q781Var6 = q781Var5;
            boolean z211 = z16;
            boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
            if (l781Var5.c) {
            }
            cd8VarM = w6p1.m(q781Var6);
            if (cd8VarM == null) {
            }
            ok51Var = l781Var5.j;
            if (ok51Var != null) {
                list3.add(((dc31) s24Var6.f).d(ok51Var));
            }
            if (z11 != 0) {
                if (q781Var6 instanceof p781) {
                    c98Var = (c98) ((p781) q781Var6).a.y.a(c98.class);
                } else {
                    if (!(q781Var6 instanceof o781)) {
                        eg.o();
                        return null;
                    }
                    c98Var = ((o781) q781Var6).i;
                }
                if (c98Var != null) {
                    x88Var = c98Var.a;
                } else {
                    x88Var = null;
                }
                if (x88Var != null) {
                    b98Var = x88Var.c;
                } else {
                    b98Var = null;
                }
                if (x88Var != null) {
                    String str110 = x88Var.b;
                    if (!x88Var.a) {
                    }
                }
            }
            z19 = z11;
            q781Var7 = q781Var6;
            igmVar4 = igmVar3;
            z20 = zBooleanValue3;
            lik1Var7 = lik1Var6;
            list4 = list3;
            if (l781Var5.d) {
                if (!k781Var.h) {
                    if (z19) {
                        list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                    }
                } else if (z19) {
                    list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                }
            }
            if (z20) {
                list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
            }
            x7i1Var = g781Var5.a;
            u35Var = k781Var.q;
            if (u35Var.k()) {
                exc0Var = x7i1Var.g;
                if (exc0Var.a) {
                    list4.add(k781Var.r.I(str13));
                } else {
                    list4.add(k781Var.r.I(str13));
                }
            }
            if (g781Var5.c) {
                zJ = u35Var.g();
            } else {
                zJ = u35Var.j();
            }
            if (zJ) {
                list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
            }
            return new kjm(igmVar4, list4, 4);
        }
        if (i4 == 1) {
            boolean z30 = i781Var5.T0;
            boolean z31 = i781Var5.S0;
            z7 = i781Var5.R0;
            boolean z32 = i781Var5.Q0;
            ArrayList arrayList4 = i781Var5.O0;
            d520 d520Var9 = i781Var5.N0;
            s24 s24Var9 = i781Var5.Z;
            List list8 = i781Var5.Y;
            igm igmVar9 = i781Var5.X;
            String str21 = i781Var5.t;
            String str22 = i781Var5.i;
            who0 who0Var5 = i781Var5.h;
            g781 g781Var6 = i781Var5.g;
            c221 c221Var5 = i781Var5.f;
            v1v v1vVar6 = i781Var5.e;
            l781 l781Var7 = i781Var5.d;
            vum1 vum1Var6 = i781Var5.c;
            lik1 lik1Var11 = i781Var5.b;
            q781Var2 = i781Var5.a;
            hm5.M(jhmVar);
            list2 = arrayList4;
            d9nVar2 = d9nVar5;
            z3 = z30;
            zS = z31;
            z8 = z32;
            d520Var4 = d520Var9;
            igmVar = igmVar9;
            str7 = str21;
            str6 = str22;
            who0Var3 = who0Var5;
            g781Var3 = g781Var6;
            v1vVar3 = v1vVar6;
            l781Var3 = l781Var7;
            obj2 = jhmVar;
            s24Var5 = s24Var9;
            list = list8;
            c221Var3 = c221Var5;
            lik1Var2 = lik1Var11;
            i781Var2 = i781Var5;
            vum1Var4 = vum1Var6;
            list2.add(obj2);
            z6 = z8;
            vum1Var3 = vum1Var4;
            s24Var4 = s24Var5;
            str4 = str7;
            str5 = str6;
            d520 d520Var10 = d520Var4;
            boolean z212 = zS;
            a821Var = l781Var3.h;
            z5 = z7;
            String str23 = l781Var3.a;
            v1vVar4 = v1vVar3;
            if ((a821Var instanceof a821) || str23 == null) {
                umbVar = null;
            } else {
                umbVar = null;
                list.add(((e821) s24Var4.X).g(a821Var.a, str5, str23, (xwp0) null));
            }
            if (l781Var3.k != 1) {
                list.add(((kr60) s24Var4.h).e((lik1) s24Var4.b, str5, lik1Var2.a, true));
            }
            if (w6p1.u(q781Var2) || ((w281VarO = w6p1.o(q781Var2)) != null && w281VarO.c)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!l781Var3.m && z9) {
                String strQ4 = w6p1.q(q781Var2);
                if (q781Var2 instanceof p781) {
                    z12 = ((p781) q781Var2).a.s >= 100;
                } else {
                    if (!(q781Var2 instanceof o781)) {
                        eg.o();
                        return umbVar;
                    }
                    z12 = ((o781) q781Var2).j.a;
                }
                iu30 iu30Var = l781Var3.l;
                r6h1 r6h1Var = l781Var3.o;
                pmb pmbVar = (pmb) d520Var10.f;
                zqg0 zqg0Var = new zqg0(strQ4, z12, r6h1Var, iu30Var);
                list.add(new jhm("audiobook_mark_as_played", z12 ? fux.c : ilx.c, (fhm) null, Integer.valueOf(z12 ? 2131954327 : 2131954326), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(c7b.a1, new tla(zqg0Var, (byte) 13)), new kd8(zqg0Var, pmbVar, (byte) 29)), 244));
            }
            k781Var = this;
            z10 = z6;
            vum1Var5 = vum1Var3;
            z11 = z212;
            q781Var3 = q781Var2;
            l781Var4 = l781Var3;
            d520Var5 = d520Var10;
            who0Var4 = who0Var3;
            str8 = str5;
            lik1Var3 = lik1Var2;
            g781Var4 = g781Var3;
            c221Var4 = c221Var3;
            str9 = str4;
            s24Var3 = s24Var4;
            igmVar2 = igmVar;
            z13 = z3;
            boolean z213 = z5;
            if (who0Var4 != null) {
                list.addAll(k781Var.w.h(lik1Var3.a, str8, l781Var4.a, who0Var4));
            }
            if (z13) {
                e2t0Var = e2t0.t;
            } else if (z11) {
                e2t0Var = e2t0.c;
            } else {
                e2t0Var = e2t0.X;
            }
            if (u890.j(vum1Var5, tum1.a)) {
                list.add(((dlg1) s24Var3.Z).i(str8, e2t0Var));
            } else if (!u890.j(vum1Var5, uum1.a)) {
                list.add(((tzr0) s24Var3.i).g(str8, e2t0Var, (lik1) s24Var3.b));
            }
            if (w6p1.s(q781Var3)) {
                q781Var4 = q781Var3;
                str10 = str8;
                lik1Var4 = lik1Var3;
                i781Var3 = i781Var2;
            } else {
                w281VarO2 = w6p1.o(q781Var3);
                if (w281VarO2 != null) {
                    umbVarS = nln.s(w281VarO2);
                } else {
                    umbVarS = umbVar;
                }
                if (u890.j(umbVarS, tmb.a)) {
                    String strQ5 = w6p1.q(q781Var3);
                    if (q781Var3 instanceof p781) {
                        xwp0Var = ((p781) q781Var3).a.z;
                    } else {
                        if (q781Var3 instanceof o781) {
                            eg.o();
                            return umbVar;
                        }
                        xwp0Var = ((o781) q781Var3).l;
                    }
                    w281VarO3 = w6p1.o(q781Var3);
                    if (w281VarO3 != null) {
                        umbVarS2 = nln.s(w281VarO3);
                    } else {
                        umbVarS2 = umbVar;
                    }
                    mxr mxrVar6 = (mxr) d520Var5.c;
                    lik1 lik1Var12 = (lik1) d520Var5.b;
                    umb umbVar6 = umbVarS2;
                    if (xwp0Var instanceof vwp0) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    xwp0 xwp0Var4 = xwp0Var;
                    drj0 drj0VarA3 = ((z4q) mxrVar6.b).a(lik1Var12);
                    if (z18) {
                        umxVar = umx.c;
                    } else {
                        umxVar = tmx.c;
                    }
                    umx umxVar4 = umxVar;
                    if (z18) {
                        i2 = 2131954466;
                    } else {
                        i2 = 2131954365;
                    }
                    Integer numValueOf3 = Integer.valueOf(i2);
                    ygm ygmVar3 = new ygm(2);
                    if (z18) {
                        hhmVar = hhm.b;
                    } else {
                        hhmVar = hhm.a;
                    }
                    lik1Var4 = lik1Var3;
                    q781Var4 = q781Var3;
                    i781Var3 = i781Var2;
                    str10 = str8;
                    list.add(new jhm("audiobook_download", umxVar4, (fhm) null, numValueOf3, (String) null, false, (tm81) null, new ihm(ygmVar3, hhmVar, new ghm(wiu.U0, new cl1(z18, strQ5, (byte) 11)), new qi1(mxrVar6, k781Var.b, xwp0Var4, v1vVar4, strQ5, umbVar6, lik1Var12, drj0VarA3, (byte) 4)), 244));
                    if (c221Var4.a) {
                        list.add(((k811) d520Var5.d).b(w6p1.q(q781Var4), 0, c221Var4.b));
                    }
                } else {
                    q781Var4 = q781Var3;
                    str10 = str8;
                    lik1Var4 = lik1Var3;
                    i781Var3 = i781Var2;
                }
            }
            if (l781Var4.f45p) {
                list.add(k781Var.t.d());
            }
            ugo0Var = l781Var4.i;
            if (ugo0Var != null) {
                if (ugo0Var.a) {
                    jhmVarS = ((kqi0) s24Var3.Y).k(ugo0Var);
                } else {
                    jhmVarS = ((dxy) s24Var3.N0).s(ugo0Var);
                }
                list.add(jhmVarS);
            }
            p860Var = l781Var4.r;
            if (p860Var != null) {
                list.add(k781Var.u.h(p860Var));
            }
            if (l781Var4.f) {
                str11 = str10;
            } else {
                str11 = str10;
            }
            q781Var5 = q781Var4;
            i781Var4 = i781Var3;
            i781Var4.a = q781Var5;
            lik1Var5 = lik1Var4;
            i781Var4.b = lik1Var5;
            umb umbVar7 = umbVar;
            i781Var4.c = umbVar7;
            i781Var4.d = l781Var4;
            i781Var4.e = umbVar7;
            i781Var4.f = umbVar7;
            g781Var5 = g781Var4;
            i781Var4.g = g781Var5;
            i781Var4.h = umbVar7;
            i781Var4.i = str11;
            str12 = str9;
            i781Var4.t = str12;
            i781Var4.X = igmVar2;
            i781Var4.Y = list;
            i781Var4.Z = s24Var3;
            i781Var4.N0 = d520Var5;
            i781Var4.O0 = umbVar7;
            z14 = z10;
            i781Var4.Q0 = z14;
            z15 = z213;
            i781Var4.R0 = z15;
            i781Var4.S0 = z11;
            i781Var4.T0 = z13;
            d520Var6 = d520Var5;
            i781Var4.X0 = 3;
            objA = k781Var.f38p.a(str11, i781Var4);
            d9nVar3 = d9nVar2;
            if (objA == d9nVar3) {
                return d9nVar3;
            }
            s24 s24Var10 = s24Var3;
            l781Var5 = l781Var4;
            s24Var6 = s24Var10;
            obj3 = objA;
            d9nVar4 = d9nVar3;
            lik1Var6 = lik1Var5;
            z16 = z13;
            list3 = list;
            d520Var7 = d520Var6;
            z17 = z14;
            igmVar3 = igmVar2;
            str13 = str11;
            q781Var6 = q781Var5;
            boolean z214 = z16;
            boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
            if (l781Var5.c) {
            }
            cd8VarM = w6p1.m(q781Var6);
            if (cd8VarM == null) {
            }
            ok51Var = l781Var5.j;
            if (ok51Var != null) {
                list3.add(((dc31) s24Var6.f).d(ok51Var));
            }
            if (z11 != 0) {
                if (q781Var6 instanceof p781) {
                    c98Var = (c98) ((p781) q781Var6).a.y.a(c98.class);
                } else {
                    if (!(q781Var6 instanceof o781)) {
                        eg.o();
                        return null;
                    }
                    c98Var = ((o781) q781Var6).i;
                }
                if (c98Var != null) {
                    x88Var = c98Var.a;
                } else {
                    x88Var = null;
                }
                if (x88Var != null) {
                    b98Var = x88Var.c;
                } else {
                    b98Var = null;
                }
                if (x88Var != null) {
                    String str111 = x88Var.b;
                    if (!x88Var.a) {
                    }
                }
            }
            z19 = z11;
            q781Var7 = q781Var6;
            igmVar4 = igmVar3;
            z20 = zBooleanValue4;
            lik1Var7 = lik1Var6;
            list4 = list3;
            if (l781Var5.d) {
                if (!k781Var.h) {
                    if (z19) {
                        list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                    }
                } else if (z19) {
                    list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                }
            }
            if (z20) {
                list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
            }
            x7i1Var = g781Var5.a;
            u35Var = k781Var.q;
            if (u35Var.k()) {
                exc0Var = x7i1Var.g;
                if (exc0Var.a) {
                    list4.add(k781Var.r.I(str13));
                } else {
                    list4.add(k781Var.r.I(str13));
                }
            }
            if (g781Var5.c) {
                zJ = u35Var.g();
            } else {
                zJ = u35Var.j();
            }
            if (zJ) {
                list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
            }
            return new kjm(igmVar4, list4, 4);
        }
        if (i4 == 2) {
            boolean z33 = i781Var5.T0;
            boolean z34 = i781Var5.S0;
            z5 = i781Var5.R0;
            boolean z35 = i781Var5.Q0;
            d520 d520Var11 = i781Var5.N0;
            s24 s24Var11 = i781Var5.Z;
            List list9 = i781Var5.Y;
            igm igmVar10 = i781Var5.X;
            String str24 = i781Var5.t;
            String str25 = i781Var5.i;
            who0 who0Var6 = i781Var5.h;
            g781 g781Var7 = i781Var5.g;
            c221 c221Var6 = i781Var5.f;
            v1v v1vVar7 = i781Var5.e;
            l781 l781Var8 = i781Var5.d;
            vum1 vum1Var7 = i781Var5.c;
            lik1 lik1Var13 = i781Var5.b;
            q781 q781Var9 = i781Var5.a;
            hm5.M(jhmVar);
            z3 = z33;
            q781Var = q781Var9;
            zS = z34;
            d520Var3 = d520Var11;
            igmVar = igmVar10;
            str = str24;
            str2 = str25;
            who0Var2 = who0Var6;
            g781Var2 = g781Var7;
            umbVar = null;
            vum1Var2 = vum1Var7;
            i781Var2 = i781Var5;
            z4 = z35;
            s24Var3 = s24Var11;
            list = list9;
            d9nVar = d9nVar5;
            c221Var2 = c221Var6;
            v1vVar2 = v1vVar7;
            l781Var2 = l781Var8;
            obj = jhmVar;
            lik1Var2 = lik1Var13;
            zBooleanValue = ((Boolean) obj).booleanValue();
            l781Var2.getClass();
            if (zBooleanValue) {
                list.add(((u961) s24Var3.t).t(str2, false, l781Var2.e, w6p1.t(q781Var)));
            }
            if (z5 != 0) {
                list.add(k781Var.B.g(str2));
            }
            jf4Var = k781Var.z.a;
            if (!jf4Var.v() && jf4Var.t() && g781Var2.a.a) {
                list.add(new jhm("bluejay_playback_controls", msx.c, (fhm) null, 2131952925, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(hxt0.f, hxt0.g), new aft0(k781Var.A, str2, (byte) 12)), 244));
            }
            v1v v1vVar8 = v1vVar2;
            l781Var4 = l781Var2;
            v1vVar4 = v1vVar8;
            q781Var3 = q781Var;
            lik1Var3 = lik1Var2;
            vum1Var5 = vum1Var2;
            z10 = z4;
            str8 = str2;
            d9nVar2 = d9nVar;
            who0Var4 = who0Var2;
            d520Var5 = d520Var3;
            z11 = zS;
            g781Var4 = g781Var2;
            c221Var4 = c221Var2;
            str9 = str;
            igmVar2 = igmVar;
            z13 = z3;
            boolean z215 = z5;
            if (who0Var4 != null) {
                list.addAll(k781Var.w.h(lik1Var3.a, str8, l781Var4.a, who0Var4));
            }
            if (z13) {
                e2t0Var = e2t0.t;
            } else if (z11) {
                e2t0Var = e2t0.c;
            } else {
                e2t0Var = e2t0.X;
            }
            if (u890.j(vum1Var5, tum1.a)) {
                list.add(((dlg1) s24Var3.Z).i(str8, e2t0Var));
            } else if (!u890.j(vum1Var5, uum1.a)) {
                list.add(((tzr0) s24Var3.i).g(str8, e2t0Var, (lik1) s24Var3.b));
            }
            if (w6p1.s(q781Var3)) {
                q781Var4 = q781Var3;
                str10 = str8;
                lik1Var4 = lik1Var3;
                i781Var3 = i781Var2;
            } else {
                w281VarO2 = w6p1.o(q781Var3);
                if (w281VarO2 != null) {
                    umbVarS = nln.s(w281VarO2);
                } else {
                    umbVarS = umbVar;
                }
                if (u890.j(umbVarS, tmb.a)) {
                    String strQ6 = w6p1.q(q781Var3);
                    if (q781Var3 instanceof p781) {
                        xwp0Var = ((p781) q781Var3).a.z;
                    } else {
                        if (q781Var3 instanceof o781) {
                            eg.o();
                            return umbVar;
                        }
                        xwp0Var = ((o781) q781Var3).l;
                    }
                    w281VarO3 = w6p1.o(q781Var3);
                    if (w281VarO3 != null) {
                        umbVarS2 = nln.s(w281VarO3);
                    } else {
                        umbVarS2 = umbVar;
                    }
                    mxr mxrVar7 = (mxr) d520Var5.c;
                    lik1 lik1Var14 = (lik1) d520Var5.b;
                    umb umbVar8 = umbVarS2;
                    if ((xwp0Var instanceof vwp0) || (xwp0Var instanceof jwp0) || (xwp0Var instanceof hwp0)) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    xwp0 xwp0Var5 = xwp0Var;
                    drj0 drj0VarA4 = ((z4q) mxrVar7.b).a(lik1Var14);
                    if (z18) {
                        umxVar = umx.c;
                    } else {
                        umxVar = tmx.c;
                    }
                    umx umxVar5 = umxVar;
                    if (z18) {
                        i2 = 2131954466;
                    } else {
                        i2 = 2131954365;
                    }
                    Integer numValueOf4 = Integer.valueOf(i2);
                    ygm ygmVar4 = new ygm(2);
                    if (z18) {
                        hhmVar = hhm.b;
                    } else {
                        hhmVar = hhm.a;
                    }
                    lik1Var4 = lik1Var3;
                    q781Var4 = q781Var3;
                    i781Var3 = i781Var2;
                    str10 = str8;
                    list.add(new jhm("audiobook_download", umxVar5, (fhm) null, numValueOf4, (String) null, false, (tm81) null, new ihm(ygmVar4, hhmVar, new ghm(wiu.U0, new cl1(z18, strQ6, (byte) 11)), new qi1(mxrVar7, k781Var.b, xwp0Var5, v1vVar4, strQ6, umbVar8, lik1Var14, drj0VarA4, (byte) 4)), 244));
                    if (c221Var4.a) {
                        list.add(((k811) d520Var5.d).b(w6p1.q(q781Var4), 0, c221Var4.b));
                    }
                } else {
                    q781Var4 = q781Var3;
                    str10 = str8;
                    lik1Var4 = lik1Var3;
                    i781Var3 = i781Var2;
                }
            }
            if (l781Var4.f45p) {
                list.add(k781Var.t.d());
            }
            ugo0Var = l781Var4.i;
            if (ugo0Var != null) {
                if (ugo0Var.a) {
                    jhmVarS = ((kqi0) s24Var3.Y).k(ugo0Var);
                } else {
                    jhmVarS = ((dxy) s24Var3.N0).s(ugo0Var);
                }
                list.add(jhmVarS);
            }
            p860Var = l781Var4.r;
            if (p860Var != null) {
                list.add(k781Var.u.h(p860Var));
            }
            if (l781Var4.f || !z10) {
                str11 = str10;
            } else {
                str11 = str10;
                list.add(((xj1) s24Var3.g).b(str11, z11));
            }
            q781Var5 = q781Var4;
            i781Var4 = i781Var3;
            i781Var4.a = q781Var5;
            lik1Var5 = lik1Var4;
            i781Var4.b = lik1Var5;
            umb umbVar9 = umbVar;
            i781Var4.c = umbVar9;
            i781Var4.d = l781Var4;
            i781Var4.e = umbVar9;
            i781Var4.f = umbVar9;
            g781Var5 = g781Var4;
            i781Var4.g = g781Var5;
            i781Var4.h = umbVar9;
            i781Var4.i = str11;
            str12 = str9;
            i781Var4.t = str12;
            i781Var4.X = igmVar2;
            i781Var4.Y = list;
            i781Var4.Z = s24Var3;
            i781Var4.N0 = d520Var5;
            i781Var4.O0 = umbVar9;
            z14 = z10;
            i781Var4.Q0 = z14;
            z15 = z215;
            i781Var4.R0 = z15;
            i781Var4.S0 = z11;
            i781Var4.T0 = z13;
            d520Var6 = d520Var5;
            i781Var4.X0 = 3;
            objA = k781Var.f38p.a(str11, i781Var4);
            d9nVar3 = d9nVar2;
            if (objA == d9nVar3) {
                return d9nVar3;
            }
            s24 s24Var12 = s24Var3;
            l781Var5 = l781Var4;
            s24Var6 = s24Var12;
            obj3 = objA;
            d9nVar4 = d9nVar3;
            lik1Var6 = lik1Var5;
            z16 = z13;
            list3 = list;
            d520Var7 = d520Var6;
            z17 = z14;
            igmVar3 = igmVar2;
            str13 = str11;
            q781Var6 = q781Var5;
            boolean z216 = z16;
            boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
            if (l781Var5.c) {
            }
            cd8VarM = w6p1.m(q781Var6);
            if (cd8VarM == null) {
            }
            ok51Var = l781Var5.j;
            if (ok51Var != null) {
                list3.add(((dc31) s24Var6.f).d(ok51Var));
            }
            if (z11 != 0) {
                if (q781Var6 instanceof p781) {
                    c98Var = (c98) ((p781) q781Var6).a.y.a(c98.class);
                } else {
                    if (!(q781Var6 instanceof o781)) {
                        eg.o();
                        return null;
                    }
                    c98Var = ((o781) q781Var6).i;
                }
                if (c98Var != null) {
                    x88Var = c98Var.a;
                } else {
                    x88Var = null;
                }
                if (x88Var != null) {
                    b98Var = x88Var.c;
                } else {
                    b98Var = null;
                }
                if (x88Var != null) {
                    String str112 = x88Var.b;
                    if (!x88Var.a) {
                    }
                }
            }
            z19 = z11;
            q781Var7 = q781Var6;
            igmVar4 = igmVar3;
            z20 = zBooleanValue5;
            lik1Var7 = lik1Var6;
            list4 = list3;
            if (l781Var5.d) {
                if (!k781Var.h) {
                    if (z19) {
                        list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                    }
                } else if (z19) {
                    list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                }
            }
            if (z20) {
                list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
            }
            x7i1Var = g781Var5.a;
            u35Var = k781Var.q;
            if (u35Var.k()) {
                exc0Var = x7i1Var.g;
                if (exc0Var.a) {
                    list4.add(k781Var.r.I(str13));
                } else {
                    list4.add(k781Var.r.I(str13));
                }
            }
            if (g781Var5.c) {
                zJ = u35Var.g();
            } else {
                zJ = u35Var.j();
            }
            if (zJ) {
                list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
            }
            return new kjm(igmVar4, list4, 4);
        }
        if (i4 == 3) {
            boolean z36 = i781Var5.T0;
            boolean z37 = i781Var5.S0;
            boolean z38 = i781Var5.R0;
            boolean z39 = i781Var5.Q0;
            d520 d520Var12 = i781Var5.N0;
            s24 s24Var13 = i781Var5.Z;
            list3 = i781Var5.Y;
            igmVar3 = i781Var5.X;
            String str26 = i781Var5.t;
            String str27 = i781Var5.i;
            g781 g781Var8 = i781Var5.g;
            l781 l781Var9 = i781Var5.d;
            lik1 lik1Var15 = i781Var5.b;
            q781 q781Var10 = i781Var5.a;
            hm5.M(jhmVar);
            z16 = z36;
            obj3 = jhmVar;
            q781Var6 = q781Var10;
            z11 = z37;
            d520Var7 = d520Var12;
            l781Var5 = l781Var9;
            str12 = str26;
            d9nVar4 = d9nVar5;
            str13 = str27;
            s24Var6 = s24Var13;
            z17 = z39;
            z15 = z38;
            g781Var5 = g781Var8;
            i781Var4 = i781Var5;
            lik1Var6 = lik1Var15;
            boolean z217 = z16;
            boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
            if (l781Var5.c && zBooleanValue6) {
                list3.add(f971.b((f971) s24Var6.c, str13, (String) null));
            }
            cd8VarM = w6p1.m(q781Var6);
            if (cd8VarM == null && (!cd8VarM.a.isEmpty())) {
                String strQ7 = w6p1.q(q781Var6);
                String strN2 = w6p1.n(q781Var6);
                boolean z40 = q781Var6 instanceof p781;
                if (z40) {
                    z24 = z40;
                    z25 = ((p781) q781Var6).a.l;
                    str14 = strN2;
                } else {
                    z24 = z40;
                    if (!(q781Var6 instanceof o781)) {
                        eg.o();
                        return null;
                    }
                    hll hllVar = ((o781) q781Var6).e;
                    if (hllVar == null || (list7 = hllVar.b) == null) {
                        str14 = strN2;
                    } else {
                        str14 = strN2;
                        if (list7.contains(ell.b)) {
                            z25 = true;
                        }
                    }
                    z25 = false;
                }
                String strP = w6p1.p(q781Var6);
                if (z24) {
                    str15 = strP;
                    strA2 = ((p781) q781Var6).a.j.a(3);
                } else {
                    str15 = strP;
                    if (!(q781Var6 instanceof o781)) {
                        eg.o();
                        return null;
                    }
                    xkk1 xkk1Var2 = ((o781) q781Var6).c;
                    strA2 = (xkk1Var2 == null || (mq70Var2 = xkk1Var2.a) == null || (up70VarA2 = mq70Var2.a(vp70.d)) == null) ? null : up70VarA2.a.a;
                }
                list3.add(new jhm("audiobook_supplementary_content", vmx.c, (fhm) null, 2131954462, (String) null, false, (tm81) null, new ihm(zgm.c, new ghm(ljc1.b1, ljc1.c1), new ccb1((dr41) d520Var7.e, new p0d1(strQ7, str14, z25, str15, strA2, w6p1.o(q781Var6), w6p1.m(q781Var6)), (byte) 18)), 244));
            }
            ok51Var = l781Var5.j;
            if (ok51Var != null) {
                list3.add(((dc31) s24Var6.f).d(ok51Var));
            }
            if (z11 != 0 && k781Var.i) {
                if (q781Var6 instanceof p781) {
                    c98Var = (c98) ((p781) q781Var6).a.y.a(c98.class);
                } else {
                    if (!(q781Var6 instanceof o781)) {
                        eg.o();
                        return null;
                    }
                    c98Var = ((o781) q781Var6).i;
                }
                if (c98Var != null) {
                    x88Var = c98Var.a;
                } else {
                    x88Var = null;
                }
                if (x88Var != null) {
                    b98Var = x88Var.c;
                } else {
                    b98Var = null;
                }
                if (x88Var != null) {
                    String str113 = x88Var.b;
                    if (!x88Var.a && str113.length() > 0 && b98Var != null && !(b98Var instanceof a98)) {
                        String strQ8 = w6p1.q(q781Var6);
                        i781Var4.a = q781Var6;
                        i781Var4.b = lik1Var6;
                        i781Var4.c = null;
                        i781Var4.d = l781Var5;
                        i781Var4.e = null;
                        i781Var4.f = null;
                        i781Var4.g = g781Var5;
                        i781Var4.h = null;
                        i781Var4.i = str13;
                        i781Var4.t = str12;
                        igm igmVar11 = igmVar3;
                        i781Var4.X = igmVar11;
                        List list10 = list3;
                        i781Var4.Y = list10;
                        i781Var4.Z = s24Var6;
                        i781Var4.N0 = null;
                        i781Var4.O0 = null;
                        i781Var4.P0 = list10;
                        i781Var4.Q0 = z17;
                        i781Var4.R0 = z21;
                        i781Var4.S0 = z22;
                        i781Var4.T0 = z217;
                        i781Var4.U0 = zBooleanValue6;
                        i781Var4.X0 = 4;
                        lik1 lik1Var16 = lik1Var6;
                        q781 q781Var11 = q781Var6;
                        List list11 = list3;
                        jhmVar = new jhm("audiobook_buy_book", upx.c, (fhm) null, (Integer) null, str113, false, (tm81) null, new ihm(new ygm(2), new ghm(iub.Z0, iub.a1), new oo6((q59) d520Var7.h, b98Var, strQ8)), 236);
                        d9n d9nVar6 = d9nVar4;
                        if (jhmVar == d9nVar6) {
                            z21 = z15;
                            z22 = z11;
                            return d9nVar6;
                        }
                        z21 = z15;
                        z22 = z11;
                        q781Var8 = q781Var11;
                        z23 = z22;
                        igmVar5 = igmVar11;
                        z20 = zBooleanValue6;
                        l781Var6 = l781Var5;
                        lik1Var8 = lik1Var16;
                        list5 = list11;
                        list6 = list5;
                    }
                    if (l781Var5.d) {
                        if (!k781Var.h && !z19) {
                            list4.add(jl21.b((jl21) s24Var6.d, w6p1.q(q781Var7), (lik1) s24Var6.b));
                        } else if (z19) {
                            list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                        }
                    }
                    if (z20) {
                        list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
                    }
                    x7i1Var = g781Var5.a;
                    u35Var = k781Var.q;
                    if (u35Var.k()) {
                        exc0Var = x7i1Var.g;
                        if (exc0Var.a || exc0Var.b || exc0Var.c) {
                            list4.add(k781Var.r.I(str13));
                        }
                    }
                    if (g781Var5.c) {
                        zJ = u35Var.g();
                    } else {
                        zJ = u35Var.j();
                    }
                    if (zJ && x7i1Var.a) {
                        list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
                    }
                    return new kjm(igmVar4, list4, 4);
                }
            }
            z19 = z11;
            q781Var7 = q781Var6;
            igmVar4 = igmVar3;
            z20 = zBooleanValue6;
            lik1Var7 = lik1Var6;
            list4 = list3;
            if (l781Var5.d) {
                if (!k781Var.h) {
                    if (z19) {
                        list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                    }
                } else if (z19) {
                    list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                }
            }
            if (z20) {
                list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
            }
            x7i1Var = g781Var5.a;
            u35Var = k781Var.q;
            if (u35Var.k()) {
                exc0Var = x7i1Var.g;
                if (exc0Var.a) {
                    list4.add(k781Var.r.I(str13));
                } else {
                    list4.add(k781Var.r.I(str13));
                }
            }
            if (g781Var5.c) {
                zJ = u35Var.g();
            } else {
                zJ = u35Var.j();
            }
            if (zJ) {
                list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
            }
            return new kjm(igmVar4, list4, 4);
        }
        if (i4 != 4) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z20 = i781Var5.U0;
        z23 = i781Var5.S0;
        list5 = i781Var5.P0;
        x88 x88Var2 = i781Var5.O0;
        s24Var6 = i781Var5.Z;
        list6 = i781Var5.Y;
        igmVar5 = i781Var5.X;
        str13 = i781Var5.i;
        g781Var5 = i781Var5.g;
        l781Var6 = i781Var5.d;
        lik1Var8 = i781Var5.b;
        q781Var8 = i781Var5.a;
        hm5.M(jhmVar);
        list5.add(jhmVar);
        q781Var7 = q781Var8;
        z19 = z23;
        list4 = list6;
        igmVar4 = igmVar5;
        lik1Var7 = lik1Var8;
        l781Var5 = l781Var6;
        if (l781Var5.d) {
            if (!k781Var.h) {
                if (z19) {
                    list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
                }
            } else if (z19) {
                list4.add(jl21.b((jl21) s24Var6.d, l781Var5.b, (lik1) s24Var6.b));
            }
        }
        if (z20) {
            list4.add(((oh41) s24Var6.e).a(w6p1.q(q781Var7)));
        }
        x7i1Var = g781Var5.a;
        u35Var = k781Var.q;
        if (u35Var.k()) {
            exc0Var = x7i1Var.g;
            if (exc0Var.a) {
                list4.add(k781Var.r.I(str13));
            } else {
                list4.add(k781Var.r.I(str13));
            }
        }
        if (g781Var5.c) {
            zJ = u35Var.g();
        } else {
            zJ = u35Var.j();
        }
        if (zJ) {
            list4.add(new jhm("sts_delete_show_item", cmx.c, (fhm) null, 2131962958, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.S0, z6t.T0), new c30(k781Var.s, str13, u890.j(lik1Var7.a, str13), (byte) 10)), 244));
        }
        return new kjm(igmVar4, list4, 4);
    }
}
