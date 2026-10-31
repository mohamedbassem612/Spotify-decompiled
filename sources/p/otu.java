package p;

import android.net.Uri;
import android.view.View;
import android.widget.PopupWindow;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class otu implements Function, l381, au11 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public otu(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                dt71 dt71VarE = mgo1.e(0, 1, 2, 1);
                this.b = dt71VarE;
                this.c = d5p1.g(dt71VarE);
                break;
            case 28:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = ConcurrentHashMap.newKeySet();
                this.c = new ConcurrentHashMap();
                break;
        }
    }

    public String a(y9z y9zVar) {
        tfs tfsVarA = ((ufs) this.b).a(y9zVar.a, y9zVar.b, y9zVar.c, Integer.valueOf(y9zVar.d), y9zVar.e, y9zVar.h);
        tfsVarA.i = y9zVar.f;
        tfsVarA.g = true;
        tfsVarA.g("d MMM yy");
        tfsVarA.m = y9zVar.i;
        tfsVarA.h = y9zVar.g;
        String strA = tfsVarA.a();
        Locale locale = (Locale) this.c;
        String lowerCase = strA.toLowerCase(locale);
        List listQ0 = ihc1.Q0(lowerCase, new String[]{"•"}, 0, 6);
        if (listQ0.size() < 2) {
            return c(lowerCase);
        }
        if (listQ0.size() == 2) {
            return xcg1.i(ihc1.e1(gm50.p((String) listQ0.get(0), locale)).toString(), " • ", c((String) listQ0.get(1)));
        }
        return ihc1.e1(gm50.p((String) listQ0.get(0), locale)).toString() + " • " + c((String) listQ0.get(1)) + " • " + c((String) listQ0.get(2));
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                Optional optional = (Optional) obj;
                kpz kpzVarN = EsOfflinePlugin.DownloadResponse.n();
                lpz lpzVar = (lpz) this.c;
                kpzVarN.u(((EsOfflinePlugin.DownloadCommand) obj2).getLink());
                kpzVarN.q();
                kpzVarN.t(0L);
                kpzVarN.n(0L);
                if (optional.isPresent()) {
                    kpzVarN.r(lpzVar);
                    kpzVarN.s(cev0.v((Throwable) optional.get()));
                } else {
                    kpzVarN.r(lpz.b);
                }
                return kpzVarN.build();
            case 4:
                return ((k3v) obj2).c((YourLibraryResponse) obj, (ywm1) this.c);
            case 9:
                SingleSubject singleSubject = new SingleSubject();
                r0w r0wVar = (r0w) this.c;
                ((lls0) obj2).z(new jzv(r0wVar, singleSubject, (byte) 0), new jzv(r0wVar, singleSubject, (byte) 1));
                return singleSubject;
            case 14:
                g710 g710Var = (a710) ((goq) obj2).b;
                String strConcat = (String) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (nhc1.Y(strConcat, "spotify:artist:", false)) {
                    String strH0 = ihc1.H0(strConcat, "spotify:artist:");
                    strConcat = zBooleanValue ? "spotify:list:popular-release-segments-main-roles:artist_".concat(strH0) : "spotify:list:offline-playable-artist:".concat(strH0);
                }
                return ((ki91) g710Var.h.get()).d(strConcat);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Long l = (Long) this.c;
                l.getClass();
                return ((h1y) obj2).e.a(PlayCommand.builder(Context.builder("").url((String) obj).build(), PlayOrigin.create("dynamic-sessions")).loggingParams(LoggingParams.builder().commandInitiatedTime(Long.valueOf(l.longValue())).build()).build()).ignoreElement();
            default:
                return ((EsPrefs.Value) obj).equals((EsPrefs.Value) obj2) ? CompletableEmpty.a : Completable.j(new Assertion.RecoverableAssertionError(String.format("Failed to save preference with key '%s'", Arrays.copyOf(new Object[]{(String) this.c}, 1)), (String) null));
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public String c(String str) {
        String string = ihc1.e1(str).toString();
        if (string.length() <= 0) {
            return string;
        }
        return ((Object) eth.U(string.charAt(0), (Locale) this.c)) + string.substring(1);
    }

    public uny d(u800 u800Var) {
        return new uny((qmr) this.b, (mvb) this.c, u800Var);
    }

    public boolean e() {
        w25 w25Var = (w25) this.c;
        if (w25Var.f()) {
            return false;
        }
        String str = ((lmo) this.b).a;
        if (u890.j(str, "default")) {
            return w25Var.T();
        }
        if (u890.j(str, "music-chip")) {
            return w25Var.U();
        }
        if (u890.j(str, "podcasts-chip")) {
            return w25Var.V();
        }
        if (u890.j(str, "audiobooks-chip")) {
            return w25Var.S();
        }
        if (u890.j(str, "rh-picker-feed")) {
            return w25Var.W();
        }
        if (u890.j(str, "rh-tango-feed")) {
            return w25Var.X();
        }
        return false;
    }

    public void f() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((brl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void g(String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        buw buwVar = new buw(str, str2);
        ((ConcurrentHashMap.KeySetView) this.b).remove(buwVar);
        wma1 wma1Var = (wma1) ((ConcurrentHashMap) this.c).remove(buwVar);
        if (wma1Var != null) {
            wma1Var.a((Long) null);
        }
        hhp0 hhp0Var = hhp0.a;
        ihp0.p("ui.elements.lifecycle_end", str);
    }

    public void h(String str, String str2) {
        hhp0 hhp0Var = hhp0.a;
        oif1 oif1Var = oif1.e;
        if (hhp0Var.g(oif1Var)) {
            if (str2 == null) {
                str2 = str;
            }
            buw buwVar = new buw(str, str2);
            ((ConcurrentHashMap.KeySetView) this.b).add(buwVar);
            ((ConcurrentHashMap) this.c).put(buwVar, ihp0.d(str, oif1Var));
        }
    }

    public void i(String str, String str2) {
        hhp0 hhp0Var = hhp0.a;
        oif1 oif1Var = oif1.f;
        if (hhp0Var.g(oif1Var)) {
            if (str2 == null) {
                str2 = str;
            }
            buw buwVar = new buw(str, str2);
            if (((ConcurrentHashMap.KeySetView) this.b).contains(buwVar)) {
                return;
            }
            ((ConcurrentHashMap) this.c).put(buwVar, ihp0.d(str, oif1Var));
        }
    }

    public void j(String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        buw buwVar = new buw(str, str2);
        ConcurrentHashMap.KeySetView keySetView = (ConcurrentHashMap.KeySetView) this.b;
        if (keySetView.contains(buwVar)) {
            keySetView.remove(buwVar);
        }
        wma1 wma1Var = (wma1) ((ConcurrentHashMap) this.c).remove(buwVar);
        if (wma1Var != null) {
            wma1Var.a((Long) null);
        }
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        c9c c9cVar = (c9c) this.b;
        if (!((np4) this.c).a()) {
            return c9cVar.k(fe00Var, unb1Var);
        }
        if (fe00Var.equals(de00.a)) {
            return ku11.a;
        }
        return fe00Var.equals(ee00.a) ? ju11.a : c9cVar.k(fe00Var, unb1Var);
    }

    public jpk0 l(String str, nrs0 nrs0Var) {
        py9 py9Var = new py9(((txk0) this.c).b(), (byte) 29);
        return new jpk0(Integer.valueOf(nrs0Var.c), str, new jpk0(Integer.valueOf(nrs0Var.b), nrs0Var.a, py9Var));
    }

    public void m(sve0 sve0Var, String str, boolean z) {
        sve0Var.a(k2v.class, hwu.class, wuu.class, new k2v(), new e1v(this));
        sve0Var.b(jc91.class, new jvn(str, z));
        sve0Var.a(qae.class, mae.class, rih1.class, new qae(), new ob2((byte) 5));
        sve0Var.b(qae.class, new d1v((pae) this.c, (byte) 1));
        sve0Var.b(jc91.class, new zae(str, (byte) 0));
    }

    public nqk0 n(rpu rpuVar) {
        nqk0 nqk0Var = new nqk0((txk0) this.c);
        int iOrdinal = rpuVar.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            i = 2;
        }
        return new nqk0(nqk0Var, i);
    }

    public void o(ArrayList arrayList) {
        String strB = ((nfa0) this.c).b(o7w.Companion.serializer(), new o7w(arrayList));
        hma1 hma1VarEdit = ((dma1) this.b).edit();
        hma1VarEdit.d(i7w.a, strB);
        hma1VarEdit.h();
    }

    public void p(er91 er91Var, int i, String str) {
        String str2;
        kt91 kt91Var = (kt91) this.b;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
        eyh0 eyh0Var = (eyh0) this.c;
        String strA = ((gdr) eyh0Var.c).a(fdr.PRE_PLAYBACK);
        i8h1 i8h1Var = (i8h1) eyh0Var.b;
        String strQ = zjy.q(i);
        char c = 0;
        if (strQ == null) {
            bhn0.i("Name is null");
        } else if (strQ.equals("ALBUM")) {
            c = 1;
        } else if (strQ.equals("ARTIST")) {
            c = 2;
        } else if (strQ.equals("AUDIOBOOK")) {
            c = 3;
        } else if (strQ.equals("EPISODE")) {
            c = 4;
        } else if (strQ.equals("PLAYLIST")) {
            c = 5;
        } else if (strQ.equals("PODCAST")) {
            c = 6;
        } else if (strQ.equals("TRACK")) {
            c = 7;
        } else {
            hhg1.n("No enum constant com.spotify.ubi.specification.factories.MobileSaveForLaterIntentSnackbarEventFactory.MobileSaveForLaterIntentSnackbarEnums.Identifier.".concat(strQ));
        }
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-save-for-later-intent-snackbar";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        switch (c) {
            case 1:
                str2 = "album";
                break;
            case 2:
                str2 = "artist";
                break;
            case 3:
                str2 = "audiobook";
                break;
            case 4:
                str2 = "episode";
                break;
            case 5:
                str2 = "playlist";
                break;
            case 6:
                str2 = "podcast";
                break;
            case 7:
                str2 = "track";
                break;
            default:
                throw null;
        }
        x6h1VarI.b = str2;
        x6h1VarI.e = strA;
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public boolean t(Object obj) {
        qxc0 qxc0Var = (qxc0) obj;
        dfv dfvVar = (dfv) this.c;
        le30 le30VarA = dfvVar.d.a(qxc0Var.e);
        d2f1 d2f1Var = dfvVar.c;
        String str = dfvVar.b;
        boolean z = qxc0Var.h;
        boolean z2 = qxc0Var.X0;
        wls0 wls0Var = qxc0Var.i;
        Map map = qxc0Var.X;
        if (gyo1.L(qxc0Var.O0) || z2 || ((wls0Var.a() && !z) || Boolean.parseBoolean((String) map.get("is_video_first")))) {
            return false;
        }
        boolean zA = d2f1.a(str, le30VarA);
        jq4 jq4Var = d2f1Var.c;
        return zA ? jq4Var.e() : jq4Var.f();
    }

    public otu(h1y h1yVar, f1y f1yVar, Long l) {
        this.a = (byte) 19;
        this.b = h1yVar;
        this.c = l;
    }

    public /* synthetic */ otu(t7y t7yVar) {
        this.a = (byte) 22;
        this.b = new bym1((frl1) t7yVar.b);
        this.c = (Uri) t7yVar.c;
    }

    public /* synthetic */ otu(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public otu(ufs ufsVar) {
        this.a = (byte) 25;
        this.b = ufsVar;
        this.c = new Locale(upn1.m());
    }

    public otu(lzn0 lzn0Var, cbk0 cbk0Var, ktv ktvVar) {
        this.a = (byte) 7;
        this.b = lzn0Var;
        this.c = cbk0Var;
    }

    public otu(i8h1 i8h1Var) {
        this.a = (byte) 13;
        this.b = i8h1Var;
        this.c = new brl0((byte) 24);
    }

    public otu(pp ppVar, rxr rxrVar) {
        this.a = (byte) 18;
        this.b = rxrVar;
    }

    public otu(android.content.Context context, v4x v4xVar, View view) {
        this.a = (byte) 17;
        this.b = view;
        this.c = new PopupWindow((View) v4xVar, -2, -2, false);
    }

    public otu(dfv dfvVar) {
        this.a = (byte) 5;
        this.c = dfvVar;
        this.b = dfvVar.g;
    }

    public otu(Set set) {
        this.a = (byte) 11;
        dm5.y(!set.isEmpty());
        dm5.z(f4w.e.containsAll(set), "trackTypes must only contain TRACK_TYPE_AUDIO and/or TRACK_TYPE_VIDEO.");
        this.c = t380.p(set);
        this.b = new v280(4);
    }

    public otu(e4w[] e4wVarArr) {
        this.a = (byte) 11;
        int i = t380.c;
        this.c = new b291(-2);
        v280 v280Var = new v280(4);
        v280Var.d(e4wVarArr);
        this.b = v280Var;
    }

    public otu(List list) {
        this.a = (byte) 11;
        int i = t380.c;
        this.c = new b291(-2);
        v280 v280Var = new v280(4);
        v280Var.e(list);
        this.b = v280Var;
    }
}
