package p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gwy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ eb80 a;
    public final /* synthetic */ wh71 b;
    public final /* synthetic */ cxy c;
    public final /* synthetic */ bhf d;

    public gwy(eb80 eb80Var, wh71 wh71Var, cxy cxyVar, bhf bhfVar) {
        this.a = eb80Var;
        this.b = wh71Var;
        this.c = cxyVar;
        this.d = bhfVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:0x0227 A[Catch: all -> 0x022e, TRY_ENTER, TryCatch #5 {all -> 0x022e, blocks: (B:104:0x0227, B:107:0x0232), top: B:195:0x0225 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0232 A[Catch: all -> 0x022e, TRY_LEAVE, TryCatch #5 {all -> 0x022e, blocks: (B:104:0x0227, B:107:0x0232), top: B:195:0x0225 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0258  */
    /* JADX WARN: Code duplicated, block: B:142:0x028a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0298  */
    /* JADX WARN: Code duplicated, block: B:151:0x029a  */
    /* JADX WARN: Code duplicated, block: B:154:0x029f  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:168:0x02db  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:175:0x0323  */
    /* JADX WARN: Code duplicated, block: B:182:0x0346  */
    /* JADX WARN: Code duplicated, block: B:203:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f A[Catch: all -> 0x0159, TRY_LEAVE, TryCatch #9 {all -> 0x0159, blocks: (B:51:0x014b, B:53:0x014f), top: B:203:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:64:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4 A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #16 {all -> 0x01df, blocks: (B:72:0x01bd, B:74:0x01c4), top: B:216:0x01bd }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8 A[Catch: all -> 0x01fc, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01fc, blocks: (B:88:0x01f8, B:94:0x0207), top: B:209:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0203 A[Catch: all -> 0x0268, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0268, blocks: (B:86:0x01e6, B:92:0x0203), top: B:188:0x01e6 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0207 A[Catch: all -> 0x01fc, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01fc, blocks: (B:88:0x01f8, B:94:0x0207), top: B:209:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x020a  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0108, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0120, please report this as an issue */
    public final Object a(Object obj, r261 r261Var, onm onmVar) throws Throwable {
        lnm fwyVar;
        r261 r261Var2;
        d9n d9nVar;
        r261 r261Var3;
        cwy cwyVar;
        bkc0 bkc0Var;
        List list;
        int i;
        o571 o571Var;
        cwy cwyVar2;
        o571 o571Var2;
        List list2;
        int i2;
        ywy ywyVar;
        String str;
        String str2;
        cwy cwyVar3;
        d9n d9nVar2;
        byte b;
        int i3;
        r261 r261Var4;
        String str3;
        r261 r261Var5;
        Object objA;
        String str4;
        bkc0 bkc0Var2;
        int i4;
        r261 r261Var6;
        d9n d9nVar3;
        byte b2;
        cuu0 cuu0Var;
        r261 n7q0Var;
        r261 r261Var7;
        r261 r261VarZ;
        n3o1 ssdVar;
        lnm lnmVar;
        r261 m231Var;
        Throwable thA;
        boolean z;
        r261 r261Var8;
        umt umtVar;
        byte b3;
        ywy ywyVar2;
        wkt wktVar;
        Throwable thA2;
        zmt ymtVar;
        l771 clw0Var;
        r261 r261Var9;
        mr20 m441Var;
        byte b4;
        mlw mlwVar;
        if (onmVar instanceof fwy) {
            fwyVar = (fwy) onmVar;
            int i5 = fwyVar.b;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fwyVar.b = i5 - Integer.MIN_VALUE;
            } else {
                fwyVar = new fwy(this, onmVar);
            }
        } else {
            fwyVar = new fwy(this, onmVar);
        }
        lnm lnmVar2 = fwyVar;
        Object objJ = lnmVar2.a;
        int i6 = lnmVar2.b;
        d9n d9nVar4 = d9n.a;
        try {
            try {
                if (i6 == 0) {
                    hm5.M(objJ);
                    cwy cwyVar4 = (cwy) obj;
                    o571 o571VarA = cwyVar4.c.a();
                    List listL1 = o7h.l1(cwyVar4.c.g());
                    ywy ywyVar3 = cwyVar4.b;
                    if (ywyVar3 instanceof wwy) {
                        Uri uri = cwyVar4.d;
                        Uri uri2 = cwyVar4.e;
                        r261Var2 = r261Var;
                        lnmVar2.d = r261Var2;
                        lnmVar2.e = cwyVar4;
                        lnmVar2.f = o571VarA;
                        lnmVar2.g = listL1;
                        lnmVar2.t = 0;
                        lnmVar2.b = 1;
                        d9nVar = d9nVar4;
                        r261Var3 = null;
                        Object objX = this.a.x(o571VarA, listL1, (wwy) ywyVar3, uri, uri2, lnmVar2);
                        if (objX != d9nVar) {
                            lnmVar2 = lnmVar2;
                            cwyVar2 = cwyVar4;
                            objJ = objX;
                            o571Var2 = o571VarA;
                            list2 = listL1;
                            i2 = 0;
                        }
                    } else {
                        r261Var2 = r261Var;
                        d9nVar = d9nVar4;
                        r261Var3 = null;
                        cwyVar = cwyVar4;
                        bkc0Var = null;
                        list = listL1;
                        i = 0;
                        o571Var = o571VarA;
                        ywyVar = cwyVar.b;
                        if (ywyVar instanceof wwy) {
                            str = "Loaded: " + ((wwy) ywyVar).f;
                        } else if (ywyVar instanceof uwy) {
                            uwy uwyVar = (uwy) ywyVar;
                            str = "Error: " + uwyVar.e + ", " + uwyVar.f;
                        } else {
                            if (ywyVar instanceof xwy) {
                                eg.o();
                                return r261Var3;
                            }
                            str = "Loading";
                        }
                        str2 = str;
                        cxy cxyVar = this.c;
                        ywy ywyVar4 = cwyVar.b;
                        if (bkc0Var != null) {
                            try {
                                str3 = bkc0Var.a;
                                if (str3 != null) {
                                    r261Var5 = Uri.parse(str3);
                                } else {
                                    r261Var5 = r261Var3;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cwyVar3 = cwyVar;
                                i3 = i;
                                d9nVar2 = d9nVar;
                                r261Var4 = r261Var2;
                                b = 1;
                                m231Var = new m231(th);
                                thA = e331.a(m231Var);
                                if (thA == null) {
                                }
                                z = m231Var instanceof m231;
                                if (z) {
                                    r261Var8 = r261Var3;
                                } else {
                                    r261Var8 = m231Var;
                                }
                                umtVar = (umt) r261Var8;
                                if (umtVar != null) {
                                    if (umtVar.b() == null) {
                                        b4 = b;
                                    } else {
                                        b4 = 0;
                                    }
                                    b3 = b4;
                                } else {
                                    b3 = 0;
                                }
                                ywyVar2 = cwyVar3.b;
                                wktVar = cwyVar3.c;
                                if (ywyVar2 instanceof xwy) {
                                }
                                if (z) {
                                    thA2 = e331.a(m231Var);
                                    if (thA2 == null) {
                                        thA2 = new IllegalStateException("Failed to collect share data");
                                    }
                                    ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                                } else {
                                    hm5.M(m231Var);
                                    ymtVar = new zmt((umt) m231Var);
                                }
                                clw0Var = new clw0(ymtVar);
                                lnmVar2.d = r261Var4;
                                lnmVar2.e = r261Var3;
                                lnmVar2.f = r261Var3;
                                lnmVar2.g = r261Var3;
                                lnmVar2.h = r261Var3;
                                lnmVar2.i = r261Var3;
                                lnmVar2.t = i3;
                                lnmVar2.X = b3;
                                lnmVar2.b = 4;
                                if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                    return d9nVar2;
                                }
                                r261Var9 = r261Var4;
                                r261Var4 = r261Var9;
                                m441Var = r6x.a;
                                mlwVar = new mlw(r261Var4, b);
                                lnmVar2.d = r261Var3;
                                lnmVar2.e = r261Var3;
                                lnmVar2.f = r261Var3;
                                lnmVar2.g = r261Var3;
                                lnmVar2.h = r261Var3;
                                lnmVar2.i = r261Var3;
                                lnmVar2.b = 5;
                                if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                                    return d9nVar2;
                                }
                                return rih1.a;
                            }
                        } else {
                            r261Var5 = r261Var3;
                        }
                        lnmVar2.d = r261Var2;
                        lnmVar2.e = cwyVar;
                        lnmVar2.f = r261Var3;
                        lnmVar2.g = r261Var3;
                        lnmVar2.h = bkc0Var;
                        lnmVar2.i = str2;
                        lnmVar2.t = i;
                        lnmVar2.X = 0;
                        lnmVar2.b = 2;
                        cwyVar3 = cwyVar;
                        objA = cxyVar.a(ywyVar4, o571Var, list, r261Var5, lnmVar2);
                        if (objA != d9nVar) {
                            str4 = str2;
                            i3 = i;
                            bkc0Var2 = bkc0Var;
                            objJ = objA;
                            i4 = 0;
                            p371 p371Var = (p371) objJ;
                            wkt wktVar2 = cwyVar3.c;
                            r261Var6 = cwyVar3.b;
                            d9nVar3 = d9nVar;
                            fpo fpoVar = new fpo(this.d, cwyVar3, r261Var3, (byte) 5);
                            az9 az9Var = new az9(bkc0Var2, r261Var3, (byte) 2);
                            String str5 = "State[" + str4 + "], ShareData=[" + p371Var + "]";
                            if (r261Var6 instanceof wwy) {
                                cuu0Var = ((wwy) r261Var6).e;
                                if (cuu0Var != null) {
                                    b2 = 1;
                                    if (cuu0Var.h()) {
                                        n7q0Var = new n7q0(r261Var6.a().a.a.a);
                                    }
                                } else {
                                    b2 = 1;
                                }
                                n7q0Var = r261Var3;
                            } else {
                                b2 = 1;
                                n7q0Var = r261Var3;
                            }
                            Set set = o6g1.a;
                            if (o6g1.a(r261Var6.a().a.a.a)) {
                                ssdVar = rsd.c;
                            } else {
                                if (r261Var6 instanceof wwy) {
                                    r261Var7 = (wwy) r261Var6;
                                } else {
                                    r261Var7 = r261Var3;
                                }
                                if (r261Var7 != null) {
                                    r261VarZ = suo1.z(r261Var7.f, r261Var7.h(), r261Var7.a.b.c);
                                } else {
                                    r261VarZ = r261Var3;
                                }
                                if (r261VarZ != null) {
                                    ssdVar = new ssd(r261VarZ);
                                } else {
                                    ssdVar = tsd.c;
                                }
                            }
                            n3o1 n3o1Var = ssdVar;
                            lnmVar2.d = r261Var2;
                            lnmVar2.e = cwyVar3;
                            lnmVar2.f = r261Var3;
                            lnmVar2.g = r261Var3;
                            lnmVar2.h = r261Var3;
                            lnmVar2.i = r261Var3;
                            lnmVar2.t = i3;
                            lnmVar2.X = i4;
                            lnmVar2.b = 3;
                            d9nVar2 = d9nVar3;
                            lnmVar = lnmVar2;
                            r261 r261Var10 = n7q0Var;
                            b = 1;
                            objJ = fq7.J(wktVar2, p371Var, fpoVar, az9Var, str5, r261Var10, n3o1Var, lnmVar);
                            lnmVar2 = lnmVar;
                            if (objJ == d9nVar2) {
                                return d9nVar2;
                            }
                            r261Var4 = r261Var2;
                            m231Var = (umt) objJ;
                            thA = e331.a(m231Var);
                            if (thA == null) {
                            }
                            z = m231Var instanceof m231;
                            if (z) {
                                r261Var8 = r261Var3;
                            } else {
                                r261Var8 = m231Var;
                            }
                            umtVar = (umt) r261Var8;
                            if (umtVar != null) {
                                if (umtVar.b() == null) {
                                    b4 = b;
                                } else {
                                    b4 = 0;
                                }
                                b3 = b4;
                            } else {
                                b3 = 0;
                            }
                            ywyVar2 = cwyVar3.b;
                            wktVar = cwyVar3.c;
                            if (ywyVar2 instanceof xwy) {
                            }
                            if (z) {
                                hm5.M(m231Var);
                                ymtVar = new zmt((umt) m231Var);
                            } else {
                                thA2 = e331.a(m231Var);
                                if (thA2 == null) {
                                    thA2 = new IllegalStateException("Failed to collect share data");
                                }
                                ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                            }
                            clw0Var = new clw0(ymtVar);
                            lnmVar2.d = r261Var4;
                            lnmVar2.e = r261Var3;
                            lnmVar2.f = r261Var3;
                            lnmVar2.g = r261Var3;
                            lnmVar2.h = r261Var3;
                            lnmVar2.i = r261Var3;
                            lnmVar2.t = i3;
                            lnmVar2.X = b3;
                            lnmVar2.b = 4;
                            if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                return d9nVar2;
                            }
                            r261Var9 = r261Var4;
                            r261Var4 = r261Var9;
                            m441Var = r6x.a;
                            mlwVar = new mlw(r261Var4, b);
                            lnmVar2.d = r261Var3;
                            lnmVar2.e = r261Var3;
                            lnmVar2.f = r261Var3;
                            lnmVar2.g = r261Var3;
                            lnmVar2.h = r261Var3;
                            lnmVar2.i = r261Var3;
                            lnmVar2.b = 5;
                            if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                                return d9nVar2;
                            }
                            return rih1.a;
                        }
                    }
                    lnmVar2 = lnmVar2;
                    return d9nVar;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = lnmVar2.X;
                        int i8 = lnmVar2.t;
                        str4 = lnmVar2.i;
                        bkc0Var2 = lnmVar2.h;
                        List list3 = lnmVar2.g;
                        cwy cwyVar5 = lnmVar2.e;
                        r261Var2 = lnmVar2.d;
                        try {
                            hm5.M(objJ);
                            i4 = i7;
                            cwyVar3 = cwyVar5;
                            d9nVar = d9nVar4;
                            i3 = i8;
                            r261Var3 = null;
                            try {
                                p371 p371Var2 = (p371) objJ;
                                wkt wktVar3 = cwyVar3.c;
                                try {
                                    r261Var6 = cwyVar3.b;
                                    d9nVar3 = d9nVar;
                                    try {
                                        fpo fpoVar2 = new fpo(this.d, cwyVar3, r261Var3, (byte) 5);
                                        az9 az9Var2 = new az9(bkc0Var2, r261Var3, (byte) 2);
                                        String str6 = "State[" + str4 + "], ShareData=[" + p371Var2 + "]";
                                        try {
                                            if (r261Var6 instanceof wwy) {
                                                try {
                                                    cuu0Var = ((wwy) r261Var6).e;
                                                    if (cuu0Var != null) {
                                                        b2 = 1;
                                                        if (cuu0Var.h()) {
                                                            try {
                                                                n7q0Var = new n7q0(r261Var6.a().a.a.a);
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                b = b2;
                                                                d9nVar2 = d9nVar3;
                                                                r261Var4 = r261Var2;
                                                                m231Var = new m231(th);
                                                                thA = e331.a(m231Var);
                                                                if (thA == null) {
                                                                }
                                                                z = m231Var instanceof m231;
                                                                if (z) {
                                                                    r261Var8 = r261Var3;
                                                                } else {
                                                                    r261Var8 = m231Var;
                                                                }
                                                                umtVar = (umt) r261Var8;
                                                                if (umtVar != null) {
                                                                    if (umtVar.b() == null) {
                                                                        b4 = b;
                                                                    } else {
                                                                        b4 = 0;
                                                                    }
                                                                    b3 = b4;
                                                                } else {
                                                                    b3 = 0;
                                                                }
                                                                ywyVar2 = cwyVar3.b;
                                                                wktVar = cwyVar3.c;
                                                                if (ywyVar2 instanceof xwy) {
                                                                }
                                                                if (z) {
                                                                    hm5.M(m231Var);
                                                                    ymtVar = new zmt((umt) m231Var);
                                                                } else {
                                                                    thA2 = e331.a(m231Var);
                                                                    if (thA2 == null) {
                                                                        thA2 = new IllegalStateException("Failed to collect share data");
                                                                    }
                                                                    ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                                                                }
                                                                clw0Var = new clw0(ymtVar);
                                                                lnmVar2.d = r261Var4;
                                                                lnmVar2.e = r261Var3;
                                                                lnmVar2.f = r261Var3;
                                                                lnmVar2.g = r261Var3;
                                                                lnmVar2.h = r261Var3;
                                                                lnmVar2.i = r261Var3;
                                                                lnmVar2.t = i3;
                                                                lnmVar2.X = b3;
                                                                lnmVar2.b = 4;
                                                                if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                                                    return d9nVar2;
                                                                }
                                                                r261Var9 = r261Var4;
                                                                r261Var4 = r261Var9;
                                                                m441Var = r6x.a;
                                                                mlwVar = new mlw(r261Var4, b);
                                                                lnmVar2.d = r261Var3;
                                                                lnmVar2.e = r261Var3;
                                                                lnmVar2.f = r261Var3;
                                                                lnmVar2.g = r261Var3;
                                                                lnmVar2.h = r261Var3;
                                                                lnmVar2.i = r261Var3;
                                                                lnmVar2.b = 5;
                                                                if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                                                                    return d9nVar2;
                                                                }
                                                                return rih1.a;
                                                            }
                                                        }
                                                    } else {
                                                        b2 = 1;
                                                    }
                                                    n7q0Var = r261Var3;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    b2 = 1;
                                                }
                                            } else {
                                                b2 = 1;
                                                n7q0Var = r261Var3;
                                            }
                                            try {
                                                Set set2 = o6g1.a;
                                                try {
                                                    if (o6g1.a(r261Var6.a().a.a.a)) {
                                                        ssdVar = rsd.c;
                                                    } else {
                                                        if (r261Var6 instanceof wwy) {
                                                            r261Var7 = (wwy) r261Var6;
                                                        } else {
                                                            r261Var7 = r261Var3;
                                                        }
                                                        if (r261Var7 != null) {
                                                            try {
                                                                r261VarZ = suo1.z(r261Var7.f, r261Var7.h(), r261Var7.a.b.c);
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                r261Var4 = r261Var2;
                                                                d9nVar2 = d9nVar3;
                                                                b = 1;
                                                            }
                                                        } else {
                                                            r261VarZ = r261Var3;
                                                        }
                                                        try {
                                                            if (r261VarZ != null) {
                                                                ssdVar = new ssd(r261VarZ);
                                                            } else {
                                                                ssdVar = tsd.c;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            d9nVar2 = d9nVar3;
                                                            b = 1;
                                                            r261Var4 = r261Var2;
                                                            m231Var = new m231(th);
                                                            thA = e331.a(m231Var);
                                                            if (thA == null) {
                                                            }
                                                            z = m231Var instanceof m231;
                                                            if (z) {
                                                                r261Var8 = r261Var3;
                                                            } else {
                                                                r261Var8 = m231Var;
                                                            }
                                                            umtVar = (umt) r261Var8;
                                                            if (umtVar != null) {
                                                                if (umtVar.b() == null) {
                                                                    b4 = b;
                                                                } else {
                                                                    b4 = 0;
                                                                }
                                                                b3 = b4;
                                                            } else {
                                                                b3 = 0;
                                                            }
                                                            ywyVar2 = cwyVar3.b;
                                                            wktVar = cwyVar3.c;
                                                            if (ywyVar2 instanceof xwy) {
                                                            }
                                                            if (z) {
                                                                hm5.M(m231Var);
                                                                ymtVar = new zmt((umt) m231Var);
                                                            } else {
                                                                thA2 = e331.a(m231Var);
                                                                if (thA2 == null) {
                                                                    thA2 = new IllegalStateException("Failed to collect share data");
                                                                }
                                                                ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                                                            }
                                                            clw0Var = new clw0(ymtVar);
                                                            lnmVar2.d = r261Var4;
                                                            lnmVar2.e = r261Var3;
                                                            lnmVar2.f = r261Var3;
                                                            lnmVar2.g = r261Var3;
                                                            lnmVar2.h = r261Var3;
                                                            lnmVar2.i = r261Var3;
                                                            lnmVar2.t = i3;
                                                            lnmVar2.X = b3;
                                                            lnmVar2.b = 4;
                                                            if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                                                return d9nVar2;
                                                            }
                                                            r261Var9 = r261Var4;
                                                            r261Var4 = r261Var9;
                                                            m441Var = r6x.a;
                                                            mlwVar = new mlw(r261Var4, b);
                                                            lnmVar2.d = r261Var3;
                                                            lnmVar2.e = r261Var3;
                                                            lnmVar2.f = r261Var3;
                                                            lnmVar2.g = r261Var3;
                                                            lnmVar2.h = r261Var3;
                                                            lnmVar2.i = r261Var3;
                                                            lnmVar2.b = 5;
                                                            if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                                                                return d9nVar2;
                                                            }
                                                            return rih1.a;
                                                        }
                                                    }
                                                    n3o1 n3o1Var2 = ssdVar;
                                                    lnmVar2.d = r261Var2;
                                                    lnmVar2.e = cwyVar3;
                                                    lnmVar2.f = r261Var3;
                                                    lnmVar2.g = r261Var3;
                                                    lnmVar2.h = r261Var3;
                                                    lnmVar2.i = r261Var3;
                                                    lnmVar2.t = i3;
                                                    lnmVar2.X = i4;
                                                    lnmVar2.b = 3;
                                                    d9nVar2 = d9nVar3;
                                                    lnmVar = lnmVar2;
                                                    r261 r261Var11 = n7q0Var;
                                                    b = 1;
                                                    try {
                                                        objJ = fq7.J(wktVar3, p371Var2, fpoVar2, az9Var2, str6, r261Var11, n3o1Var2, lnmVar);
                                                        lnmVar2 = lnmVar;
                                                        if (objJ == d9nVar2) {
                                                            return d9nVar2;
                                                        }
                                                        r261Var4 = r261Var2;
                                                        m231Var = (umt) objJ;
                                                        thA = e331.a(m231Var);
                                                        if (thA == null) {
                                                        }
                                                        z = m231Var instanceof m231;
                                                        if (z) {
                                                            r261Var8 = r261Var3;
                                                        } else {
                                                            r261Var8 = m231Var;
                                                        }
                                                        umtVar = (umt) r261Var8;
                                                        if (umtVar != null) {
                                                            if (umtVar.b() == null) {
                                                                b4 = b;
                                                            } else {
                                                                b4 = 0;
                                                            }
                                                            b3 = b4;
                                                        } else {
                                                            b3 = 0;
                                                        }
                                                        ywyVar2 = cwyVar3.b;
                                                        wktVar = cwyVar3.c;
                                                        if (ywyVar2 instanceof xwy) {
                                                        }
                                                        if (z) {
                                                            hm5.M(m231Var);
                                                            ymtVar = new zmt((umt) m231Var);
                                                        } else {
                                                            thA2 = e331.a(m231Var);
                                                            if (thA2 == null) {
                                                                thA2 = new IllegalStateException("Failed to collect share data");
                                                            }
                                                            ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                                                        }
                                                        clw0Var = new clw0(ymtVar);
                                                        lnmVar2.d = r261Var4;
                                                        lnmVar2.e = r261Var3;
                                                        lnmVar2.f = r261Var3;
                                                        lnmVar2.g = r261Var3;
                                                        lnmVar2.h = r261Var3;
                                                        lnmVar2.i = r261Var3;
                                                        lnmVar2.t = i3;
                                                        lnmVar2.X = b3;
                                                        lnmVar2.b = 4;
                                                        if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                                            return d9nVar2;
                                                        }
                                                        r261Var9 = r261Var4;
                                                        r261Var4 = r261Var9;
                                                        m441Var = r6x.a;
                                                        mlwVar = new mlw(r261Var4, b);
                                                        lnmVar2.d = r261Var3;
                                                        lnmVar2.e = r261Var3;
                                                        lnmVar2.f = r261Var3;
                                                        lnmVar2.g = r261Var3;
                                                        lnmVar2.h = r261Var3;
                                                        lnmVar2.i = r261Var3;
                                                        lnmVar2.b = 5;
                                                        if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                                                            return d9nVar2;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        lnmVar2 = lnmVar;
                                                        r261Var4 = r261Var2;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    b = b2;
                                                    r261Var4 = r261Var2;
                                                    d9nVar2 = d9nVar3;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                b = b2;
                                                d9nVar2 = d9nVar3;
                                                r261Var4 = r261Var2;
                                                m231Var = new m231(th);
                                                thA = e331.a(m231Var);
                                                if (thA == null) {
                                                }
                                                z = m231Var instanceof m231;
                                                if (z) {
                                                    r261Var8 = r261Var3;
                                                } else {
                                                    r261Var8 = m231Var;
                                                }
                                                umtVar = (umt) r261Var8;
                                                if (umtVar != null) {
                                                    if (umtVar.b() == null) {
                                                        b4 = b;
                                                    } else {
                                                        b4 = 0;
                                                    }
                                                    b3 = b4;
                                                } else {
                                                    b3 = 0;
                                                }
                                                ywyVar2 = cwyVar3.b;
                                                wktVar = cwyVar3.c;
                                                if (ywyVar2 instanceof xwy) {
                                                }
                                                if (z) {
                                                    hm5.M(m231Var);
                                                    ymtVar = new zmt((umt) m231Var);
                                                } else {
                                                    thA2 = e331.a(m231Var);
                                                    if (thA2 == null) {
                                                        thA2 = new IllegalStateException("Failed to collect share data");
                                                    }
                                                    ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                                                }
                                                clw0Var = new clw0(ymtVar);
                                                lnmVar2.d = r261Var4;
                                                lnmVar2.e = r261Var3;
                                                lnmVar2.f = r261Var3;
                                                lnmVar2.g = r261Var3;
                                                lnmVar2.h = r261Var3;
                                                lnmVar2.i = r261Var3;
                                                lnmVar2.t = i3;
                                                lnmVar2.X = b3;
                                                lnmVar2.b = 4;
                                                if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                                    return d9nVar2;
                                                }
                                                r261Var9 = r261Var4;
                                                r261Var4 = r261Var9;
                                                m441Var = r6x.a;
                                                mlwVar = new mlw(r261Var4, b);
                                                lnmVar2.d = r261Var3;
                                                lnmVar2.e = r261Var3;
                                                lnmVar2.f = r261Var3;
                                                lnmVar2.g = r261Var3;
                                                lnmVar2.h = r261Var3;
                                                lnmVar2.i = r261Var3;
                                                lnmVar2.b = 5;
                                                if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                                                    return d9nVar2;
                                                }
                                                return rih1.a;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            b = 1;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        d9nVar2 = d9nVar3;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    d9nVar2 = d9nVar;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                d9nVar2 = d9nVar;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            b = 1;
                            cwyVar3 = cwyVar5;
                            d9nVar2 = d9nVar4;
                            i3 = i8;
                            r261Var4 = r261Var2;
                            r261Var3 = null;
                        }
                    } else if (i6 == 3) {
                        int i9 = lnmVar2.t;
                        List list4 = lnmVar2.g;
                        cwy cwyVar6 = lnmVar2.e;
                        r261Var4 = lnmVar2.d;
                        try {
                            hm5.M(objJ);
                            i3 = i9;
                            cwyVar3 = cwyVar6;
                            b = 1;
                            r261Var3 = null;
                            d9nVar2 = d9nVar4;
                            try {
                                m231Var = (umt) objJ;
                            } catch (Throwable th14) {
                                th = th14;
                                m231Var = new m231(th);
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            i3 = i9;
                            cwyVar3 = cwyVar6;
                            b = 1;
                            r261Var3 = null;
                            d9nVar2 = d9nVar4;
                        }
                        thA = e331.a(m231Var);
                        if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                            throw thA;
                        }
                        z = m231Var instanceof m231;
                        if (z) {
                            r261Var8 = r261Var3;
                        } else {
                            r261Var8 = m231Var;
                        }
                        umtVar = (umt) r261Var8;
                        if (umtVar != null) {
                            if (umtVar.b() == null) {
                                b4 = b;
                            } else {
                                b4 = 0;
                            }
                            b3 = b4;
                        } else {
                            b3 = 0;
                        }
                        ywyVar2 = cwyVar3.b;
                        wktVar = cwyVar3.c;
                        if ((ywyVar2 instanceof xwy) || b3 == 0 || cwyVar3.f >= 10) {
                            if (z) {
                                hm5.M(m231Var);
                                ymtVar = new zmt((umt) m231Var);
                            } else {
                                thA2 = e331.a(m231Var);
                                if (thA2 == null) {
                                    thA2 = new IllegalStateException("Failed to collect share data");
                                }
                                ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                            }
                            clw0Var = new clw0(ymtVar);
                            lnmVar2.d = r261Var4;
                            lnmVar2.e = r261Var3;
                            lnmVar2.f = r261Var3;
                            lnmVar2.g = r261Var3;
                            lnmVar2.h = r261Var3;
                            lnmVar2.i = r261Var3;
                            lnmVar2.t = i3;
                            lnmVar2.X = b3;
                            lnmVar2.b = 4;
                            if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                                return d9nVar2;
                            }
                            r261Var9 = r261Var4;
                            r261Var4 = r261Var9;
                            m441Var = r6x.a;
                        } else {
                            m441Var = new m441(new p1r(cwyVar3, r261Var3, (byte) 19));
                        }
                        mlwVar = new mlw(r261Var4, b);
                        lnmVar2.d = r261Var3;
                        lnmVar2.e = r261Var3;
                        lnmVar2.f = r261Var3;
                        lnmVar2.g = r261Var3;
                        lnmVar2.h = r261Var3;
                        lnmVar2.i = r261Var3;
                        lnmVar2.b = 5;
                        if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                            return d9nVar2;
                        }
                    } else if (i6 == 4) {
                        List list5 = lnmVar2.g;
                        r261Var9 = lnmVar2.d;
                        hm5.M(objJ);
                        b = 1;
                        r261Var3 = null;
                        d9nVar2 = d9nVar4;
                        r261Var4 = r261Var9;
                        m441Var = r6x.a;
                        mlwVar = new mlw(r261Var4, b);
                        lnmVar2.d = r261Var3;
                        lnmVar2.e = r261Var3;
                        lnmVar2.f = r261Var3;
                        lnmVar2.g = r261Var3;
                        lnmVar2.h = r261Var3;
                        lnmVar2.i = r261Var3;
                        lnmVar2.b = 5;
                        if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                            return d9nVar2;
                        }
                    } else {
                        if (i6 != 5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objJ);
                    }
                    m231Var = new m231(th);
                    thA = e331.a(m231Var);
                    if (thA == null) {
                    }
                    z = m231Var instanceof m231;
                    if (z) {
                        r261Var8 = r261Var3;
                    } else {
                        r261Var8 = m231Var;
                    }
                    umtVar = (umt) r261Var8;
                    if (umtVar != null) {
                        if (umtVar.b() == null) {
                            b4 = b;
                        } else {
                            b4 = 0;
                        }
                        b3 = b4;
                    } else {
                        b3 = 0;
                    }
                    ywyVar2 = cwyVar3.b;
                    wktVar = cwyVar3.c;
                    if (ywyVar2 instanceof xwy) {
                    }
                    if (z) {
                        hm5.M(m231Var);
                        ymtVar = new zmt((umt) m231Var);
                    } else {
                        thA2 = e331.a(m231Var);
                        if (thA2 == null) {
                            thA2 = new IllegalStateException("Failed to collect share data");
                        }
                        ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                    }
                    clw0Var = new clw0(ymtVar);
                    lnmVar2.d = r261Var4;
                    lnmVar2.e = r261Var3;
                    lnmVar2.f = r261Var3;
                    lnmVar2.g = r261Var3;
                    lnmVar2.h = r261Var3;
                    lnmVar2.i = r261Var3;
                    lnmVar2.t = i3;
                    lnmVar2.X = b3;
                    lnmVar2.b = 4;
                    if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                    r261Var9 = r261Var4;
                    r261Var4 = r261Var9;
                    m441Var = r6x.a;
                    mlwVar = new mlw(r261Var4, b);
                    lnmVar2.d = r261Var3;
                    lnmVar2.e = r261Var3;
                    lnmVar2.f = r261Var3;
                    lnmVar2.g = r261Var3;
                    lnmVar2.h = r261Var3;
                    lnmVar2.i = r261Var3;
                    lnmVar2.b = 5;
                    if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    int i10 = lnmVar2.t;
                    list2 = lnmVar2.g;
                    o571Var2 = lnmVar2.f;
                    cwyVar2 = lnmVar2.e;
                    r261 r261Var12 = lnmVar2.d;
                    hm5.M(objJ);
                    i2 = i10;
                    d9nVar = d9nVar4;
                    r261Var2 = r261Var12;
                    r261Var3 = null;
                }
                return rih1.a;
                objA = cxyVar.a(ywyVar4, o571Var, list, r261Var5, lnmVar2);
                if (objA != d9nVar) {
                    str4 = str2;
                    i3 = i;
                    bkc0Var2 = bkc0Var;
                    objJ = objA;
                    i4 = 0;
                    p371 p371Var3 = (p371) objJ;
                    wkt wktVar4 = cwyVar3.c;
                    r261Var6 = cwyVar3.b;
                    d9nVar3 = d9nVar;
                    fpo fpoVar3 = new fpo(this.d, cwyVar3, r261Var3, (byte) 5);
                    az9 az9Var3 = new az9(bkc0Var2, r261Var3, (byte) 2);
                    String str7 = "State[" + str4 + "], ShareData=[" + p371Var3 + "]";
                    if (r261Var6 instanceof wwy) {
                        cuu0Var = ((wwy) r261Var6).e;
                        if (cuu0Var != null) {
                            b2 = 1;
                            if (cuu0Var.h()) {
                                n7q0Var = new n7q0(r261Var6.a().a.a.a);
                            }
                        } else {
                            b2 = 1;
                        }
                        n7q0Var = r261Var3;
                    } else {
                        b2 = 1;
                        n7q0Var = r261Var3;
                    }
                    Set set3 = o6g1.a;
                    if (o6g1.a(r261Var6.a().a.a.a)) {
                        ssdVar = rsd.c;
                    } else {
                        if (r261Var6 instanceof wwy) {
                            r261Var7 = (wwy) r261Var6;
                        } else {
                            r261Var7 = r261Var3;
                        }
                        if (r261Var7 != null) {
                            r261VarZ = suo1.z(r261Var7.f, r261Var7.h(), r261Var7.a.b.c);
                        } else {
                            r261VarZ = r261Var3;
                        }
                        if (r261VarZ != null) {
                            ssdVar = new ssd(r261VarZ);
                        } else {
                            ssdVar = tsd.c;
                        }
                    }
                    n3o1 n3o1Var3 = ssdVar;
                    lnmVar2.d = r261Var2;
                    lnmVar2.e = cwyVar3;
                    lnmVar2.f = r261Var3;
                    lnmVar2.g = r261Var3;
                    lnmVar2.h = r261Var3;
                    lnmVar2.i = r261Var3;
                    lnmVar2.t = i3;
                    lnmVar2.X = i4;
                    lnmVar2.b = 3;
                    d9nVar2 = d9nVar3;
                    lnmVar = lnmVar2;
                    r261 r261Var13 = n7q0Var;
                    b = 1;
                    objJ = fq7.J(wktVar4, p371Var3, fpoVar3, az9Var3, str7, r261Var13, n3o1Var3, lnmVar);
                    lnmVar2 = lnmVar;
                    if (objJ == d9nVar2) {
                        return d9nVar2;
                    }
                    r261Var4 = r261Var2;
                    m231Var = (umt) objJ;
                    thA = e331.a(m231Var);
                    if (thA == null) {
                    }
                    z = m231Var instanceof m231;
                    if (z) {
                        r261Var8 = r261Var3;
                    } else {
                        r261Var8 = m231Var;
                    }
                    umtVar = (umt) r261Var8;
                    if (umtVar != null) {
                        if (umtVar.b() == null) {
                            b4 = b;
                        } else {
                            b4 = 0;
                        }
                        b3 = b4;
                    } else {
                        b3 = 0;
                    }
                    ywyVar2 = cwyVar3.b;
                    wktVar = cwyVar3.c;
                    if (ywyVar2 instanceof xwy) {
                    }
                    if (z) {
                        hm5.M(m231Var);
                        ymtVar = new zmt((umt) m231Var);
                    } else {
                        thA2 = e331.a(m231Var);
                        if (thA2 == null) {
                            thA2 = new IllegalStateException("Failed to collect share data");
                        }
                        ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                    }
                    clw0Var = new clw0(ymtVar);
                    lnmVar2.d = r261Var4;
                    lnmVar2.e = r261Var3;
                    lnmVar2.f = r261Var3;
                    lnmVar2.g = r261Var3;
                    lnmVar2.h = r261Var3;
                    lnmVar2.i = r261Var3;
                    lnmVar2.t = i3;
                    lnmVar2.X = b3;
                    lnmVar2.b = 4;
                    if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                    r261Var9 = r261Var4;
                    r261Var4 = r261Var9;
                    m441Var = r6x.a;
                    mlwVar = new mlw(r261Var4, b);
                    lnmVar2.d = r261Var3;
                    lnmVar2.e = r261Var3;
                    lnmVar2.f = r261Var3;
                    lnmVar2.g = r261Var3;
                    lnmVar2.h = r261Var3;
                    lnmVar2.i = r261Var3;
                    lnmVar2.b = 5;
                    if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                    return rih1.a;
                }
                lnmVar2 = lnmVar2;
                return d9nVar;
            } catch (Throwable th16) {
                th = th16;
                d9nVar2 = d9nVar;
                b = 1;
                i3 = i;
                r261Var4 = r261Var2;
                m231Var = new m231(th);
                thA = e331.a(m231Var);
                if (thA == null) {
                }
                z = m231Var instanceof m231;
                if (z) {
                    r261Var8 = r261Var3;
                } else {
                    r261Var8 = m231Var;
                }
                umtVar = (umt) r261Var8;
                if (umtVar != null) {
                    if (umtVar.b() == null) {
                        b4 = b;
                    } else {
                        b4 = 0;
                    }
                    b3 = b4;
                } else {
                    b3 = 0;
                }
                ywyVar2 = cwyVar3.b;
                wktVar = cwyVar3.c;
                if (ywyVar2 instanceof xwy) {
                }
                if (z) {
                    hm5.M(m231Var);
                    ymtVar = new zmt((umt) m231Var);
                } else {
                    thA2 = e331.a(m231Var);
                    if (thA2 == null) {
                        thA2 = new IllegalStateException("Failed to collect share data");
                    }
                    ymtVar = new ymt(cwyVar3.b.a().a.a.a, wktVar.a(), thA2, wktVar.b());
                }
                clw0Var = new clw0(ymtVar);
                lnmVar2.d = r261Var4;
                lnmVar2.e = r261Var3;
                lnmVar2.f = r261Var3;
                lnmVar2.g = r261Var3;
                lnmVar2.h = r261Var3;
                lnmVar2.i = r261Var3;
                lnmVar2.t = i3;
                lnmVar2.X = b3;
                lnmVar2.b = 4;
                if (this.b.a(clw0Var, lnmVar2) == d9nVar2) {
                    return d9nVar2;
                }
                r261Var9 = r261Var4;
                r261Var4 = r261Var9;
                m441Var = r6x.a;
                mlwVar = new mlw(r261Var4, b);
                lnmVar2.d = r261Var3;
                lnmVar2.e = r261Var3;
                lnmVar2.f = r261Var3;
                lnmVar2.g = r261Var3;
                lnmVar2.h = r261Var3;
                lnmVar2.i = r261Var3;
                lnmVar2.b = 5;
                if (m441Var.collect(mlwVar, lnmVar2) == d9nVar2) {
                    return d9nVar2;
                }
                return rih1.a;
            }
            cxy cxyVar2 = this.c;
            ywy ywyVar5 = cwyVar.b;
            if (bkc0Var != null) {
                str3 = bkc0Var.a;
                if (str3 != null) {
                    r261Var5 = Uri.parse(str3);
                } else {
                    r261Var5 = r261Var3;
                }
            } else {
                r261Var5 = r261Var3;
            }
            lnmVar2.d = r261Var2;
            lnmVar2.e = cwyVar;
            lnmVar2.f = r261Var3;
            lnmVar2.g = r261Var3;
            lnmVar2.h = bkc0Var;
            lnmVar2.i = str2;
            lnmVar2.t = i;
            lnmVar2.X = 0;
            lnmVar2.b = 2;
            cwyVar3 = cwyVar;
        } catch (Throwable th17) {
            th = th17;
            cwyVar3 = cwyVar;
        }
        bkc0Var = (bkc0) objJ;
        i = i2;
        o571Var = o571Var2;
        cwyVar = cwyVar2;
        list = list2;
        ywyVar = cwyVar.b;
        if (ywyVar instanceof wwy) {
            str = "Loaded: " + ((wwy) ywyVar).f;
        } else if (ywyVar instanceof uwy) {
            uwy uwyVar2 = (uwy) ywyVar;
            str = "Error: " + uwyVar2.e + ", " + uwyVar2.f;
        } else {
            if (ywyVar instanceof xwy) {
                eg.o();
                return r261Var3;
            }
            str = "Loading";
        }
        str2 = str;
    }
}
