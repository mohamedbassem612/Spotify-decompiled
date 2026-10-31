package p;

import android.app.AlertDialog;
import android.content.ClipDescription;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.meet_coactivities.zzdl;
import com.google.type.DateTime;
import com.spotify.concertpageview.v1.EventHero;
import com.spotify.concertpageview.v1.GetConcertPageResponse;
import com.spotify.concertpageview.v1.HeaderArtist;
import com.spotify.concertpageview.v1.HeaderConcept;
import com.spotify.concertpageview.v1.PageHeader;
import com.spotify.concertpageview.v1.Tab;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.command.SetShufflingContextCommand;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lls0 implements Function, com.spotify.mobius.functions.Function, m381, qs40, ps40 {
    public static final mls0 d = new mls0(null, true);
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;

    public lls0(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.c = new vro0(vro0.i1, vro0.j1, 10000L, (String) null, iko1.B("smallIconDrawableResId"), iko1.B("stopLiveStreamDrawableResId"), iko1.B("pauseDrawableResId"), iko1.B("playDrawableResId"), iko1.B("skipNextDrawableResId"), iko1.B("skipPrevDrawableResId"), iko1.B("forwardDrawableResId"), iko1.B("forward10DrawableResId"), iko1.B("forward30DrawableResId"), iko1.B("rewindDrawableResId"), iko1.B("rewind10DrawableResId"), iko1.B("rewind30DrawableResId"), iko1.B("disconnectDrawableResId"), iko1.B("notificationImageSizeDimenResId"), iko1.B("castingToDeviceStringResId"), iko1.B("stopLiveStreamStringResId"), iko1.B("pauseStringResId"), iko1.B("playStringResId"), iko1.B("skipNextStringResId"), iko1.B("skipPrevStringResId"), iko1.B("forwardStringResId"), iko1.B("forward10StringResId"), iko1.B("forward30StringResId"), iko1.B("rewindStringResId"), iko1.B("rewind10StringResId"), iko1.B("rewind30StringResId"), iko1.B("disconnectStringResId"), (IBinder) null, false, false);
                this.b = true;
                break;
            case 12:
                break;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                this.c = new SparseBooleanArray();
                break;
            default:
                this.c = new sjb((byte) 7);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0184  */
    /* JADX WARN: Code duplicated, block: B:40:0x0189  */
    /* JADX WARN: Code duplicated, block: B:43:0x0194  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v23 java.lang.Object, still in use, count: 2, list:
          (r6v23 java.lang.Object) from 0x0180: PHI (r6 I:??) = (r6v15 java.lang.Object), (r6v23 java.lang.Object) binds: [B:36:0x017f, B:85:0x0180] A[DONT_GENERATE, DONT_INLINE]
          (r6v23 java.lang.Object) from 0x0174: CHECK_CAST (com.spotify.concertpageview.v1.VenueMapLink) (r6v23 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static java.util.ArrayList C(p.h290 r13) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lls0.C(p.h290):java.util.ArrayList");
    }

    public static lls0 o(Context context) {
        byte b = 5;
        boolean z = false;
        Float fValueOf = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z = true;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    fValueOf = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException unused) {
        }
        return new lls0(fValueOf, z, b);
    }

    public void A(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, jzv jzvVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        dg30 dg30Var = (dg30) this.c;
        arrayList.add(new zce(dg30Var.getString(2131955313), 2131428575, true));
        if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(dg30Var.getPackageManager()) != null) {
            arrayList.add(new zce(dg30Var.getString(2131955315), 2131428577, true));
        }
        if (jzvVar != null) {
            arrayList.add(new zce(dg30Var.getString(2131955314), 2131428576, z));
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(dg30Var, 5);
        builder.setTitle(dg30Var.getString(2131955316));
        yce yceVar = new yce(dg30Var, arrayList);
        builder.setAdapter(yceVar, new ok5(yceVar, onClickListener, onClickListener2, jzvVar, (byte) 1));
        builder.show();
    }

    public void B(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        dg30 dg30Var = (dg30) this.c;
        mw40 mw40VarT = yoi1.T(dg30Var, dg30Var.getString(2131955321), dg30Var.getString(2131955320));
        mw40VarT.a = dg30Var.getString(2131955319);
        mw40VarT.c = onClickListener;
        mw40VarT.b = dg30Var.getString(2131955318);
        mw40VarT.d = onClickListener2;
        mw40VarT.b().b();
    }

    public void D() {
        ClipDescription primaryClipDescription;
        ung ungVar = (ung) this.c;
        boolean z = false;
        if (ob51.l(ungVar).hasPrimaryClip() && (primaryClipDescription = ob51.l(ungVar).getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    public Object apply(Object obj) {
        Observable observableJust;
        switch (this.a) {
            case 2:
                boolean z = this.b;
                tp7 tp7Var = ((c77) this.c).l;
                if (z) {
                    return ((bge0) tp7Var.g).c.j.d(SetShufflingContextCommand.create(true)).ignoreElement().q(new CompletableFromAction(new dmk1(tp7Var, (byte) 1)));
                }
                bge0 bge0Var = (bge0) tp7Var.g;
                Flowable flowable = bge0Var.a;
                return ydh.f(flowable, flowable).J(o810.Y).B(new upa0(bge0Var, (byte) 13)).q(new CompletableFromAction(new dmk1(tp7Var, (byte) 0)));
            case 4:
                eeh eehVar = (eeh) obj;
                if (this.b) {
                    op8 op8Var = (op8) this.c;
                    return op8Var.c.b("ads").distinctUntilChanged().map(s9w.X).take(1L).singleOrError().map(new fl1(op8Var, eehVar));
                }
                Single singleJust = Single.just(eehVar);
                singleJust.getClass();
                return singleJust;
            case 14:
                atq0 atq0Var = (atq0) obj;
                cdh cdhVar = (cdh) this.c;
                if (!(atq0Var instanceof zsq0)) {
                    if (!(atq0Var instanceof xsq0)) {
                        eg.o();
                        return null;
                    }
                    Observable observableJust2 = Observable.just(atq0Var);
                    observableJust2.getClass();
                    return observableJust2;
                }
                yv00 yv00Var = (yv00) ((zsq0) atq0Var).a;
                iam iamVarA = yv00Var.a.a.y.a(iam.class);
                boolean z2 = this.b;
                b7x b7xVar = b7x.a;
                if (z2) {
                    if ((iamVarA != null ? iamVarA.a : 0) == 6) {
                        List list = yv00Var.a.b;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((i1z) it.next()).a);
                        }
                        observableJust = cdhVar.c.a(o7h.p1(arrayList)).subscribeOn(cdhVar.a).map(new ps7(atq0Var, (byte) 25)).startWithItem(new zsq0(new mmr0(atq0Var, b7xVar)));
                    } else {
                        observableJust = Observable.just(new zsq0(new mmr0(atq0Var, b7xVar)));
                    }
                } else {
                    observableJust = Observable.just(new zsq0(new mmr0(atq0Var, b7xVar)));
                }
                observableJust.getClass();
                return observableJust;
            default:
                return g((GetConcertPageResponse) obj);
        }
    }

    public o3r b() {
        return (o3r) this.c;
    }

    public void c(int i) {
        dm5.y(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public void d(ko20 ko20Var) {
        for (int i = 0; i < ko20Var.a.size(); i++) {
            c(ko20Var.b(i));
        }
    }

    public void e(int... iArr) {
        for (int i : iArr) {
            c(i);
        }
    }

    public synchronized void f(ss40 ss40Var, long j) {
        if (this.b) {
            ((cce) this.c).f(ss40Var, j);
        }
    }

    public ca00 g(GetConcertPageResponse getConcertPageResponse) {
        int i;
        Context context = ((qfl1) this.c).a;
        PageHeader pageHeaderO = getConcertPageResponse.o();
        String strR = pageHeaderO.r();
        List artistsList = pageHeaderO.getArtistsList();
        ArrayList arrayList = new ArrayList(q7h.U(artistsList, 10));
        Iterator it = artistsList.iterator();
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            HeaderArtist headerArtist = (HeaderArtist) it.next();
            String name = headerArtist.getName();
            String imageUrl = headerArtist.getImageUrl();
            String strN = headerArtist.n();
            int iOrdinal = headerArtist.o().ordinal();
            if (iOrdinal != 1) {
                i2 = iOrdinal != 2 ? 1 : 3;
            }
            arrayList.add(new sv50(name, imageUrl, i2, strN));
        }
        String strO = pageHeaderO.o();
        String title = pageHeaderO.getTitle();
        DateTime dateTimeP = pageHeaderO.p();
        String strO2 = pageHeaderO.s().o();
        String strP = pageHeaderO.s().p();
        String strO3 = pageHeaderO.s().o();
        ma00 ma00Var = null;
        String strQ = this.b ? pageHeaderO.s().q() : null;
        h290<HeaderConcept> h290VarN = pageHeaderO.n();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
        for (HeaderConcept headerConcept : h290VarN) {
            arrayList2.add(new p5k(headerConcept.n(), headerConcept.getName(), headerConcept.o()));
            strQ = strQ;
        }
        String str = strQ;
        if (getConcertPageResponse.r()) {
            EventHero eventHeroN = getConcertPageResponse.n();
            if (!ihc1.y0(eventHeroN.p())) {
                int i3 = dqk.a[eventHeroN.o().ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                }
                ma00Var = new ma00(eventHeroN.p(), i, (String) null, (String) null, (Integer) null, (Integer) null);
            }
        }
        la00 la00Var = new la00(strR, arrayList, "", strO, title, dateTimeP, strO2, strP, strO3, str, arrayList2, ma00Var);
        ArrayList arrayListC = C(getConcertPageResponse.p());
        h290<Tab> h290VarQ = getConcertPageResponse.q();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarQ, 10));
        for (Tab tab : h290VarQ) {
            arrayList3.add(new ved1(tab.o(), tab.getTitle(), C(tab.p()), tab.n()));
        }
        return new ca00(la00Var, arrayListC, arrayList3, false, false, (String) null, new yro0(2, context.getString(2131959194), context.getString(2131959189), context.getString(2131959191), context.getString(2131959190)), new lto0(false, new jb00(false, false)), fvo0.a, false, wt6.c, (Long) null);
    }

    public synchronized void h() {
        if (this.b) {
            ((cce) this.c).h();
        }
    }

    public h3e i() {
        return new h3e("com.google.android.gms.cast.framework.media.MediaIntentReceiver", (String) null, (IBinder) null, (vro0) this.c, false, this.b);
    }

    public void j(ss40 ss40Var) {
        if (this.b) {
            ((cce) this.c).j(ss40Var);
        }
    }

    public void k() {
        if (this.b) {
            ((cce) this.c).k();
        }
    }

    public ko20 l() {
        dm5.y(!this.b);
        this.b = true;
        return new ko20((SparseBooleanArray) this.c);
    }

    public rch m(zzdl zzdlVar, Executor executor) {
        rch rchVar = new rch((b380) this.c, this.b);
        rchVar.i = new qch(rchVar, zzdlVar, executor, (byte) 0);
        rchVar.F();
        return rchVar;
    }

    public void n() {
        this.b = true;
    }

    public synchronized void onFlush() {
        if (this.b) {
            ((cce) this.c).onFlush();
        }
    }

    public Float p() {
        return (Float) this.c;
    }

    public int q() {
        Float f;
        if (!this.b || (f = (Float) this.c) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        fhe fheVar = (fhe) obj;
        if (!eqn1.O(vhc1Var.getUri(), this.b)) {
            return false;
        }
        mtl mtlVar = fheVar.a;
        return (mtlVar != null ? mtlVar.a : null) == ktl.c || u890.j(fheVar.b, Boolean.TRUE);
    }

    public boolean s() {
        return this.b;
    }

    public ie30 t(ie30 ie30Var) {
        sjb sjbVar = (sjb) this.c;
        if (!this.b || !sjbVar.e(ie30Var)) {
            return ie30Var;
        }
        ge30 ge30VarA = ie30Var.a();
        String str = ie30Var.l;
        ge30VarA.o = asj0.p("application/x-media3-cues");
        ge30VarA.P = sjbVar.c(ie30Var);
        StringBuilder sb = new StringBuilder();
        sb.append(ie30Var.p);
        sb.append(str != null ? " ".concat(str) : "");
        ge30VarA.k = sb.toString();
        ge30VarA.t = Long.MAX_VALUE;
        return new ie30(ge30VarA);
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return this.b ? "FALL_THROUGH" : String.valueOf(this.c);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(String str, onm onmVar) {
        ia8 ia8Var;
        if (onmVar instanceof ia8) {
            ia8Var = (ia8) onmVar;
            int i = ia8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ia8Var.c = i - Integer.MIN_VALUE;
            } else {
                ia8Var = new ia8(this, onmVar);
            }
        } else {
            ia8Var = new ia8(this, onmVar);
        }
        Object objC = ia8Var.a;
        int i2 = ia8Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            if (!this.b) {
                return Boolean.FALSE;
            }
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            if (s4b1VarX.c != blc0.fh) {
                return Boolean.FALSE;
            }
            String strJ = s4b1VarX.j();
            if (strJ == null) {
                return Boolean.FALSE;
            }
            ka8 ka8Var = (ka8) this.c;
            ia8Var.c = 1;
            objC = ka8Var.c(strJ, ia8Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        return Boolean.valueOf(((sy21) objC).a.Q0);
    }

    public Object v(h8b h8bVar, Integer num, tx9 tx9Var, ua2 ua2Var) {
        String str = this.b ? nik1.V6.a : jf2.b.a;
        mmr0 mmr0Var = new mmr0("age_assurance_state", h8bVar.name());
        mmr0 mmr0Var2 = new mmr0("days_left", num);
        u8b u8bVar = tx9Var instanceof u8b ? (u8b) tx9Var : null;
        Object objB = i3j0.b((i3j0) this.c, str, f3j0.a, mno1.h(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("pending_deeplink_uri", u8bVar != null ? u8bVar.d : null)}), ua2Var, 4);
        return objB == d9n.a ? objB : rih1.a;
    }

    public void w(String str, zzy zzyVar, Boolean bool, tv80 tv80Var) {
        lik1 lik1VarB;
        if (this.b) {
            Parcelable.Creator creator = lik1.CREATOR;
            lik1VarB = new lik1(f4i1.f("spotify:internal:parental-control:child-login:", str, ""));
        } else {
            lik1VarB = nik1.n0.b("spotify:internal:parental-control:login-choice:".concat(str));
        }
        String strA = zzyVar.a(lik1VarB);
        bwn0 bwn0Var = tv80Var != null ? new bwn0(tv80Var) : null;
        Bundle bundleG = mno1.g();
        if (bool != null) {
            bundleG.putBoolean("is_free_override", bool.booleanValue());
        }
        ((lzn0) this.c).i(new dwn0(strA, "", false, false, 0, 0, false, (a690) null, (Bundle) null, bwn0Var), bundleG);
    }

    public void x() {
        this.b = false;
    }

    public void y() {
        this.c = null;
    }

    public void z(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        new AlertDialog.Builder((dg30) this.c, 5).setTitle(2131955310).setMessage(2131955309).setPositiveButton(2131955305, onClickListener).setNegativeButton(2131955304, onClickListener2).show();
    }

    public /* synthetic */ lls0(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ lls0(boolean z, Object obj, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    public lls0(vfl vflVar, boolean z) {
        this.a = (byte) 16;
        this.b = z;
        this.c = new qbk(d5p1.h(((yfl) vflVar).c), this, (byte) 10);
    }

    public lls0(yzc0 yzc0Var) {
        this.a = (byte) 18;
        bpb1 bpb1VarB = gio1.b(kbr.a);
        this.c = bpb1VarB;
        hu20.e(bpb1VarB, new qd0((lnm) null, yzc0Var, this, (byte) 12));
    }

    public lls0(boolean z) {
        this.a = (byte) 21;
        this.b = z;
        this.c = w3p1.n(new l4r(new wlu(rc11.a.b(mtl.class)), 2, f9z.O0, new j4r(new gy((byte) 27, z)), f9z.P0), new l4r(jd0.h, 2, f9z.Q0, new j4r(new gy((byte) 28, z)), f9z.R0), ecz.a);
    }

    public /* synthetic */ lls0(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public lls0(d1d d1dVar, g661 g661Var) {
        this.a = (byte) 22;
        this.b = false;
        this.c = new h0y((byte) 7);
    }

    public lls0(ks40 ks40Var, dos dosVar, rs40 rs40Var, roj1 roj1Var) {
        this.a = (byte) 26;
        this.c = new cce(ks40Var, (rs40) dosVar, rs40Var, roj1Var);
    }
}
