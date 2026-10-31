package p;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k7a1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7a1(BluetoothLeScanner bluetoothLeScanner, hqd1 hqd1Var, qfl1 qfl1Var) {
        super(0);
        this.a = (byte) 24;
        this.b = bluetoothLeScanner;
        this.c = hqd1Var;
    }

    public final Object invoke() {
        lck0 lck0Var;
        byte b = this.a;
        byte b2 = 19;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke(((bc81) obj).g);
                return rih1Var;
            case 1:
                ((iu30) obj2).invoke(((kba1) obj).a);
                return rih1Var;
            case 2:
                pha1 pha1Var = (pha1) obj2;
                grq grqVar = pha1Var.c;
                uk71 uk71Var = new uk71((koc0) obj, pha1Var, (lnm) null, (byte) 22);
                jnq jnqVar = (jnq) grqVar.a.b;
                return new kpg0(new et90(((jbt) jnqVar.c).b, ((qop) jnqVar.b).d(), ((lzp) jnqVar.d).a.P3(), uk71Var), hea1.Q0);
            case 3:
                return ((ima1) obj2).o().getStringSet(((bma1) obj).a, w7x.a);
            case 4:
                ((faa0) obj2).d((CancellationException) null);
                ((l811) obj).a = true;
                return rih1Var;
            case 5:
                ((ven0) obj).setValue(Boolean.TRUE);
                yxa1 yxa1Var = (yxa1) obj2;
                r2a1 r2a1Var = yxa1Var.j;
                ji0 ji0Var = yxa1Var.a.a;
                r2a1Var.o("split_video_expanded", ji0Var);
                ao0.a(yxa1Var.k, co0.t, ji0Var.a, (Long) null, "player", (String) null, 116);
                yt91 yt91Var = yxa1Var.n;
                bqk0 bqk0Var = (bqk0) yt91Var.c;
                if (bqk0Var != null) {
                    i8h1 i8h1Var = (i8h1) yt91Var.b;
                    x6h1 x6h1VarC = bqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("video_surface", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                a1r0.j(yxa1Var.c, "spotify:internal:video-ad-overlay", (String) null, mno1.h(new mmr0[]{new mmr0("video_ad_overlay_parameters", new rcj1(ji0Var.c, ji0Var.S0, ji0Var.U0, ji0Var.g.b, ji0Var.a, ji0Var.h, ji0Var.t, ji0Var.b, ji0Var.e, ji0Var.R0, ji0Var.i, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a))}), false, 10);
                return rih1Var;
            case 6:
                int iIntValue = ((Number) ((tob1) obj2).getValue()).intValue();
                float fFloatValue = ((Number) ((hrr0) ((s24) obj).h).getValue()).floatValue();
                return Boolean.valueOf(fFloatValue == 0.0f || 1.0f - Math.abs(((float) iIntValue) / fFloatValue) >= 0.33f);
            case 7:
                r2b1 r2b1Var = (r2b1) obj2;
                r2b1Var.a.getClass();
                dn81 dn81VarA = u3c.a();
                if (dn81VarA != null) {
                    wh91 wh91Var = new wh91(r2b1Var, (byte) 16);
                    n3c n3cVar = (n3c) dn81VarA.b;
                    vr51 vr51Var = new vr51(wh91Var, (byte) 16);
                    y861 y861Var = n3cVar.f;
                    paz0 paz0Var = new paz0(n3cVar.d, 11);
                    paz0Var.i = (String) obj;
                    paz0Var.j = vr51Var;
                    y861Var.i(paz0Var);
                }
                return rih1Var;
            case 8:
                r3b1 r3b1Var = (r3b1) obj2;
                return Observable.create(new nl51(r3b1Var, b2)).compose(r3b1Var.b).startWithItem(gbl.f).distinctUntilChanged().debounce(new dr41((Scheduler) obj, (byte) 20)).replay(1).f();
            case 9:
                ijq ijqVar = (ijq) ((kly0) obj2).get();
                o5b1 o5b1Var = ((n5b1) obj).f;
                switch (ijqVar.a) {
                    case 0:
                        obq obqVar = ijqVar.b;
                        ojq ojqVar = (ojq) obqVar.d;
                        return new i4m((hcl) ojqVar.e1.get(), (zih0) ojqVar.c1.get(), (q8n) obqVar.b.V2.get(), o5b1Var);
                    default:
                        obq obqVar2 = ijqVar.b;
                        ojq ojqVar2 = (ojq) obqVar2.d;
                        return new i4m((hcl) ojqVar2.e1.get(), (zih0) ojqVar2.c1.get(), (q8n) obqVar2.b.V2.get(), o5b1Var);
                }
            case 10:
                hfb1 hfb1Var = (hfb1) obj;
                bpb1 bpb1Var = hfb1Var.b;
                jnq jnqVar2 = (jnq) ((yrq) obj2).a.c;
                d0r d0rVar = ((gl90) jnqVar2.c).b;
                vzp vzpVar = (vzp) jnqVar2.b;
                vbs vbsVar = (vbs) vzpVar.b.wf.get();
                c8o.l(vbsVar);
                luk lukVar = (luk) vzpVar.b.L1.get();
                c8o.l(lukVar);
                return new xzq(new gfb1(d0rVar, vbsVar, new jq4(lukVar), (jxp) jnqVar2.d, bpb1Var), new l5b1(hfb1Var, (byte) 13));
            case 11:
                jmq jmqVar = (jmq) ((zrq) obj2).a.b;
                d0r d0rVar2 = ((gl90) jmqVar.a).b;
                luk lukVar2 = (luk) ((p0q) jmqVar.c).b.L1.get();
                c8o.l(lukVar2);
                return new xzq(new qlb(d0rVar2, new jq4(lukVar2), (byte) 18), new l5b1((nfb1) obj, (byte) 15));
            case 12:
                return new xzq((tyq) ((ghb1) obj2).a.invoke((oud) obj), cgb1.i);
            case 13:
                ((iu30) obj2).invoke(new ysb1(((zsb1) obj).a.a));
                return rih1Var;
            case 14:
                ((iu30) obj2).invoke(jxb1.a);
                ((pxb1) obj).c.invoke();
                return rih1Var;
            case 15:
                ((iu30) obj2).invoke((k1c1) obj);
                return rih1Var;
            case 16:
                ((gpm0) obj2).g.remove((n1c1) obj);
                return rih1Var;
            case 17:
                return new xzq(new jd6(((ltp) ((fsq) obj2).a.b).a.b, (byte) 21), new qd81((t2n0) obj, b2));
            case 18:
                iu30 iu30Var = (iu30) obj2;
                int iOrdinal = ((fkc1) obj).ordinal();
                if (iOrdinal == 0) {
                    lck0Var = pck0.a;
                } else if (iOrdinal == 1) {
                    lck0Var = hck0.a;
                } else if (iOrdinal == 2) {
                    lck0Var = ick0.a;
                } else if (iOrdinal == 3) {
                    lck0Var = kck0.a;
                } else if (iOrdinal == 4) {
                    lck0Var = mck0.a;
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    lck0Var = lck0.a;
                }
                iu30Var.invoke(lck0Var);
                return rih1Var;
            case 19:
                ((iu30) obj2).invoke(new xrc1(((asc1) obj).b));
                return rih1Var;
            case 20:
                ((iu30) obj2).invoke(new rp71(((vp71) obj).g));
                return rih1Var;
            case 21:
                qhd1 qhd1Var = (qhd1) obj2;
                yod yodVarB = ((fpd) obj).b();
                if (yodVarB != null) {
                    qhd1Var.Z.o(new z00(yodVarB.b, qyo1.G(yodVarB), true));
                }
                return rih1Var;
            case 22:
                wlr wlrVar = (wlr) obj2;
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.a;
                String str2 = uv11Var.d;
                return wlrVar.a(new ahe(str, str2 != null ? str2 : ""));
            case 23:
                ((iu30) obj2).invoke(new qpd1(((spd1) obj).a));
                return rih1Var;
            case 24:
                ((BluetoothLeScanner) obj2).stopScan((ScanCallback) obj);
                return rih1Var;
            case 25:
                lvc1 lvc1Var = (lvc1) obj;
                String str3 = hqu.a;
                i8h1 i8h1Var2 = (i8h1) ((idd1) lvc1Var.d).getValue();
                txk0 txk0Var = (txk0) lvc1Var.c;
                txk0Var.getClass();
                x6h1 x6h1VarC2 = txk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((iu30) obj2).invoke(new kvz(i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 26:
                ((iu30) obj2).invoke((ad10) obj);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((w3w) obj2).invoke((ccy) obj);
                return rih1Var;
            case 28:
                ((iu30) obj2).invoke(jyd1.a);
                yup0 yup0Var = (yup0) obj;
                ((ck20) yup0Var.d).c.take(1L).flatMapCompletable(bk20.b).subscribe(new ruz0(yup0Var, (byte) 18));
                return rih1Var;
            default:
                ((iu30) obj2).invoke(q0e1.a);
                ((v0e1) obj).a.invoke();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7a1(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
