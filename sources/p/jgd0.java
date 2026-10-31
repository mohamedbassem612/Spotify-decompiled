package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import com.spotify.lyrics.offlineimpl.database.LyricsDatabase_Impl;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jgd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgd0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pua0) obj).dispose();
                return rih1Var;
            case 1:
                ((xab1) obj).d((CancellationException) null);
                return rih1Var;
            case 2:
                ymd0 fai0Var = new fai0();
                apd0 apd0Var = (apd0) obj;
                fai0Var.m(new ioj0(b7xVar));
                rl1 rl1Var = apd0Var.b;
                fai0 fai0Var2 = (fai0) rl1Var.e;
                if (!rl1Var.b) {
                    fai0Var2.n(t5p1.j(hu20.e(((roc0) ((koc0) rl1Var.d)).d(), new zz90(lnmVar, (Object) rl1Var, (byte) 12)), 3), new z11(rl1Var, (byte) 23));
                    rl1Var.b = true;
                }
                fai0Var.n(fai0Var2, new df3(fai0Var, (byte) 10));
                haa0 haa0Var = apd0Var.c;
                return q1o1.u(new jpg0(new jb3(((omr) haa0Var.b).a(fai0Var), ((bvs) haa0Var.c).a(fai0Var), f6o1.A(new cx0((byte) 28), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fai0Var, (c460) ((ikp) haa0Var.d).get()), new l6d0(apd0Var, (byte) 13)), u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 3:
                return (abu0) ((kly0) ((bjx) obj).e).get();
            case 4:
                m7p0 m7p0Var = ((dqd0) obj).J1;
                if (m7p0Var != null) {
                    return new l7p0(m7p0Var.c.incrementAndGet());
                }
                u890.C("nowPlayingVisibilityStateUpdater");
                throw null;
            case 5:
                ird0 ird0Var = (ird0) ((srd0) obj).b.get();
                if (ird0Var != null) {
                    mrd0 mrd0Var = ird0Var.a;
                    fn31.T(mrd0Var.N0, (o8n) null, 0, new iyb0(mrd0Var, (lnm) null, (byte) 5), 3);
                }
                return rih1Var;
            case 6:
                k241 k241Var = ((v6e0) obj).b;
                if (k241Var.c == null) {
                    return rih1Var;
                }
                k241Var.c();
                if (k241Var.c == null) {
                    k241Var.c = k241Var.a.subscribe(new fv5(k241Var, (byte) 17));
                    return rih1Var;
                }
                eg.m("Loader is already running.");
                return null;
            case 7:
                e491[] e491VarArr = (e491[]) obj;
                return xpn1.G((e491[]) Arrays.copyOf(e491VarArr, e491VarArr.length));
            case 8:
                b031 b031Var = (x7e0) obj;
                b031 b031Var2 = b031Var instanceof b031 ? b031Var : null;
                if (b031Var2 != null) {
                    return b031Var2.serialize();
                }
                return null;
            case 9:
                return ((m6e0) ((bjx) obj).b).serialize();
            case 10:
                return new DispatcherWorker(((see0) obj).e);
            case 11:
                return new kpg0((see0) ((vn8) ((fb3) obj).c).a.get(), u0e0.c1);
            case 12:
                fad0 fad0Var = (fad0) obj;
                ltm1 ltm1Var = (ltm1) fad0Var.c;
                Context context = (Context) fad0Var.b;
                ltm1Var.getClass();
                return ltm1.c(context);
            case 13:
                return new nu((doe) obj, (byte) 0);
            case 14:
                kh60 kh60Var = (kh60) ((w6e0) obj).d;
                return m5n1.p(kh60Var.a, new zi50(kh60Var, (byte) 16));
            case 15:
                hz70 hz70Var = (hz70) obj;
                if (hz70Var instanceof fz70) {
                    Bitmap bitmap = (Bitmap) ((fz70) hz70Var).a.invoke();
                    if (bitmap != null) {
                        return new kxa(bitmap);
                    }
                    return null;
                }
                if (hz70Var instanceof gz70) {
                    return x2p1.h((Drawable) ((gz70) hz70Var).a.invoke());
                }
                eg.o();
                return null;
            case 16:
                return (LocationManager) ((aje0) obj).a.getSystemService("location");
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("close_app", 1, Collections.singletonMap("app", "music")), ((nqk0) obj).b, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Context context2 = ((cue0) obj).a;
                try {
                    Context applicationContext = context2.getApplicationContext();
                    sw9 sw9Var = new sw9(context2.getApplicationContext());
                    sw9Var.H();
                    return hzx.a(applicationContext, "accountswitching_logged_out_usernames", sw9Var.v(), fzx.b, gzx.b);
                } catch (Exception e) {
                    Logger.e(e, "AccountSwitching: logged out usernames store could not be created", new Object[0]);
                    return null;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (i8h1) ((iye0) obj).a.get();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                t7f0 t7f0Var = (t7f0) obj;
                luk lukVar = t7f0Var.b;
                if (lukVar != null) {
                    return lukVar.e(new d26(t7f0Var, (byte) 19));
                }
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                l9f0 l9f0Var = (l9f0) obj;
                luk lukVar2 = l9f0Var.c;
                if (lukVar2 != null) {
                    return lukVar2.e(new d26(l9f0Var, (byte) 20));
                }
                return null;
            case 22:
                x9f0 x9f0Var = (x9f0) obj;
                luk lukVar3 = x9f0Var.b;
                if (lukVar3 != null) {
                    return lukVar3.e(new d26(x9f0Var, (byte) 21));
                }
                return null;
            case 23:
                abf0 abf0Var = (abf0) obj;
                luk lukVar4 = abf0Var.b;
                if (lukVar4 != null) {
                    return lukVar4.e(new d26(abf0Var, (byte) 22));
                }
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new iff0((LyricsDatabase_Impl) obj);
            case 25:
                qjf0 qjf0Var = (qjf0) obj;
                a1r0 a1r0Var = qjf0Var.e;
                if (a1r0Var.h(qjf0Var.f)) {
                    a1r0Var.g();
                } else {
                    qjf0Var.d.e();
                }
                return rih1Var;
            case 26:
                ((LyricsFullscreenPageActivity) obj).finish();
                return rih1Var;
            case 27:
                npf0 npf0Var = (npf0) obj;
                return npf0Var.b.b.d(npf0Var.a, "spotify_preferences");
            case 28:
                return Boolean.valueOf(!((iqf0) obj).c.isEmpty());
            default:
                return (i8h1) ((qvf0) obj).a.get();
        }
    }
}
