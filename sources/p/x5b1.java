package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x5b1 extends vv81 {
    public static final m8u0 q;
    public final wph0 h;
    public final sua i;
    public final lhs0 j;
    public final Handler k;
    public uv81 l;
    public List m;
    public Function0 n;
    public kmo o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zud0 f166p;

    static {
        l8u0 l8u0Var = new l8u0();
        l8u0Var.a.e(new int[]{31, 2, 1});
        q = l8u0Var.d();
    }

    public x5b1(wph0 wph0Var, sua suaVar, lhs0 lhs0Var) {
        super(Looper.getMainLooper());
        this.h = wph0Var;
        this.i = suaVar;
        this.j = lhs0Var;
        this.k = new Handler(this.c);
        tv81 tv81Var = new tv81();
        tv81Var.a = q;
        this.l = new uv81(tv81Var);
        this.m = z6x.a;
        this.n = l4b1.f;
        this.o = new imo(0, 0);
    }

    public static ArrayList B1(r4z0 r4z0Var, j2i0 j2i0Var) {
        return o7h.N0(o7h.k0(r4z0Var.c, 1), p7h.N(j2i0Var));
    }

    public static PlaybackException C1(r0i0 r0i0Var) {
        int i;
        mgz mgzVar = r0i0Var.e;
        if (mgzVar == null) {
            return null;
        }
        switch (mgzVar.ordinal()) {
            case 1:
                i = -2;
                break;
            case 2:
                i = -6;
                break;
            case 3:
                i = -102;
                break;
            case 4:
                i = -103;
                break;
            case 5:
                i = -104;
                break;
            case 6:
                i = -105;
                break;
            case 7:
                i = -106;
                break;
            case 8:
                i = -110;
                break;
            case 9:
                i = -107;
                break;
            case 10:
            default:
                i = 1000;
                break;
            case 11:
                i = -109;
                break;
        }
        return new PlaybackException(r0i0Var.f, (Throwable) null, i, Bundle.EMPTY, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[LOOP:3: B:104:0x01a8->B:137:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0171 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0159  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d  */
    public static m8u0 D1(List list, boolean z) {
        Iterator it;
        l8u0 l8u0Var = new l8u0();
        List<bhh0> list2 = list;
        ArrayList<ugh0> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof ugh0) {
                arrayList.add(obj);
            }
        }
        for (ugh0 ugh0Var : arrayList) {
            l8u0 l8u0Var2 = new l8u0();
            if (u890.j(ugh0Var, lgh0.a)) {
                l8u0Var2.a(1);
            } else if (u890.j(ugh0Var, vgh0.b)) {
                l8u0Var2.a(1);
            } else if (u890.j(ugh0Var, wgh0.b)) {
                l8u0Var2.a(1);
            } else if (u890.j(ugh0Var, rgh0.a)) {
                l8u0Var2.a(9);
                l8u0Var2.a(8);
            } else if (u890.j(ugh0Var, tgh0.a)) {
                l8u0Var2.a(7);
                l8u0Var2.a(6);
            } else if (u890.j(ugh0Var, lgh0.b)) {
                l8u0Var2.a(3);
            } else if (u890.j(ugh0Var, vgh0.c)) {
                l8u0Var2.a(31);
                l8u0Var2.a(2);
            } else if (u890.j(ugh0Var, ngh0.a)) {
                l8u0Var2.a(31);
            } else if (u890.j(ugh0Var, mgh0.a)) {
                l8u0Var2.a(31);
            } else if (u890.j(ugh0Var, vgh0.a)) {
                l8u0Var2.a(15);
            } else if (u890.j(ugh0Var, wgh0.c)) {
                l8u0Var2.a(5);
            } else if (u890.j(ugh0Var, wgh0.a)) {
                l8u0Var2.a(14);
            } else if (!u890.j(ugh0Var, vgh0.d)) {
                eg.o();
                return null;
            }
            l8u0Var.a.d(l8u0Var2.d().a);
        }
        if (!z && (!(list2 instanceof Collection) || !list2.isEmpty())) {
            for (bhh0 bhh0Var : list2) {
                if ((bhh0Var instanceof ngh0) || (bhh0Var instanceof mgh0)) {
                    l8u0Var.a(1);
                    break;
                }
            }
        }
        boolean z2 = list2 instanceof Collection;
        if (!z2 || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    if (z2 || !list2.isEmpty()) {
                        for (bhh0 bhh0Var2 : list2) {
                            if (!(bhh0Var2 instanceof qgh0) || (bhh0Var2 instanceof sgh0)) {
                                l8u0Var.a(9);
                                l8u0Var.a(8);
                                break;
                            }
                        }
                    }
                } else if (((bhh0) it2.next()) instanceof rgh0) {
                }
            }
        } else if (z2) {
            while (r1.hasNext()) {
                if (!(bhh0Var2 instanceof qgh0)) {
                }
                l8u0Var.a(9);
                l8u0Var.a(8);
            }
        } else {
            while (r1.hasNext()) {
                if (!(bhh0Var2 instanceof qgh0)) {
                }
                l8u0Var.a(9);
                l8u0Var.a(8);
            }
        }
        if (!z2 || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((bhh0) it3.next()) instanceof tgh0) {
                }
            }
            if (!z2 || !list2.isEmpty()) {
                it = list2.iterator();
                while (it.hasNext()) {
                    if (((bhh0) it.next()) instanceof pgh0) {
                        l8u0Var.a(7);
                        l8u0Var.a(6);
                        break;
                    }
                }
            }
        } else if (!z2) {
            it = list2.iterator();
            while (it.hasNext()) {
                if (((bhh0) it.next()) instanceof pgh0) {
                    l8u0Var.a(7);
                    l8u0Var.a(6);
                    break;
                }
            }
        } else {
            it = list2.iterator();
            while (it.hasNext()) {
                if (((bhh0) it.next()) instanceof pgh0) {
                    l8u0Var.a(7);
                    l8u0Var.a(6);
                    break;
                }
            }
        }
        l8u0Var.a(10);
        l8u0Var.a(18);
        l8u0Var.a(33);
        l8u0Var.a(34);
        l8u0Var.a(23);
        l8u0Var.a(17);
        l8u0Var.a(16);
        return l8u0Var.d();
    }

    public static int E1(r0i0 r0i0Var) {
        int iC = l1d.C(r0i0Var.a);
        if (iC != 0) {
            if (iC == 1) {
                Integer num = i2p1.l(r0i0Var.b, -1L) ? null : 3;
                if (num != null) {
                    return num.intValue();
                }
            } else {
                if (iC == 2) {
                    return 3;
                }
                if (iC == 3) {
                    return 2;
                }
                if (iC != 4 && iC != 5) {
                    eg.o();
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void x1(tv81 tv81Var, kmo kmoVar) {
        if (kmoVar instanceof imo) {
            a9a a9aVar = new a9a(0);
            imo imoVar = (imo) kmoVar;
            a9aVar.d = imoVar.b;
            tv81Var.r = a9aVar.h();
            tv81Var.b(imoVar.a);
            return;
        }
        if (!(kmoVar instanceof jmo)) {
            eg.o();
            return;
        }
        a9a a9aVar2 = new a9a(1);
        jmo jmoVar = (jmo) kmoVar;
        a9aVar2.d = jmoVar.b;
        a9aVar2.c = 0;
        a9aVar2.e = jmoVar.c;
        tv81Var.r = a9aVar2.h();
        tv81Var.b(jmoVar.a.intValue());
    }

    public static void z1(tv81 tv81Var, float f) throws Exception {
        try {
            tv81Var.k = k2u0.d.b(f);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException)) {
                throw e;
            }
            n57.t("Failed to set playback speed: " + f, e);
        }
    }

    public final void A1(tv81 tv81Var, r4z0 r4z0Var, j2i0 j2i0Var) {
        byte[] bArr;
        upq upqVar = new upq();
        upqVar.a = r4z0Var.a;
        tv81Var.z = new tqh0(upqVar);
        ArrayList arrayListB1 = B1(r4z0Var, j2i0Var);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListB1, 10));
        int i = 0;
        for (Object obj : arrayListB1) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            j2i0 j2i0Var2 = (j2i0) obj;
            this.i.getClass();
            i2i0 i2i0Var = j2i0Var2.i;
            String str = j2i0Var2.e;
            String str2 = j2i0Var2.d;
            upq upqVar2 = new upq();
            upqVar2.s = Boolean.TRUE;
            upqVar2.r = Boolean.FALSE;
            String str3 = j2i0Var2.b;
            upqVar2.a = str3;
            upqVar2.e = str3;
            upqVar2.f = j2i0Var2.c ? str2 : str;
            upqVar2.c = str2;
            upqVar2.d = j2i0Var2.f;
            upqVar2.n = j2i0Var2.g;
            upqVar2.b = str;
            upqVar2.d(Long.valueOf(i2i0Var.a));
            Bundle bundle = new Bundle();
            long j = i2i0Var.a;
            if (j <= 0) {
                bundle.remove(MediaMetadataCompat.METADATA_KEY_DURATION);
            } else {
                bundle.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j);
            }
            bundle.putLong("android.media.IS_EXPLICIT", j2i0Var2.j ? 1L : 0L);
            bundle.putLong(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, j2i0Var2.k ? 2L : 0L);
            String str4 = j2i0Var2.l;
            if (TextUtils.isEmpty(str4)) {
                bundle.remove("com.spotify.music.extra.CONTEXT_URI");
            } else {
                bundle.putString("com.spotify.music.extra.CONTEXT_URI", str4);
            }
            Uri uri = Uri.parse(j2i0Var2.m);
            Uri uri2 = Uri.EMPTY;
            if (uri2.equals(uri)) {
                bundle.remove("com.spotify.music.extra.CONTEXT_SHARE_URL");
            } else {
                bundle.putString("com.spotify.music.extra.CONTEXT_SHARE_URL", uri.toString());
            }
            bundle.putString("com.spotify.music.extra.EXTRA_EXTRACTED_COLOR_DARK_HIGH_CONTRAST_BACKGROUND_BASE", j2i0Var2.o);
            String str5 = j2i0Var2.n;
            if (str5 != null) {
                if (TextUtils.isEmpty(str5)) {
                    bundle.remove("com.spotify.music.extra.CONTEXT_TITLE");
                } else {
                    bundle.putString("com.spotify.music.extra.CONTEXT_TITLE", str5);
                }
            }
            odn odnVar = j2i0Var2.h;
            if (odnVar != null && (bArr = (byte[]) odnVar.b.getValue()) != null) {
                upqVar2.c(bArr, 6);
            }
            bundle.putString("com.spotify.music.extra.CONTEXT_DESCRIPTION", j2i0Var2.p);
            Uri uri3 = j2i0Var2.q;
            if (uri2.equals(uri3)) {
                bundle.remove("com.spotify.music.extra.ART_HTTPS_URI");
            } else {
                bundle.putString("com.spotify.music.extra.ART_HTTPS_URI", uri3.toString());
            }
            bundle.putLong("com.spotify.music.extra.IS_19_PLUS", j2i0Var2.s ? 1L : 0L);
            Uri uri4 = j2i0Var2.r;
            if (uri2.equals(uri4)) {
                bundle.remove("com.spotify.music.extra.CANVAS_URI");
            } else {
                bundle.putString("com.spotify.music.extra.CANVAS_URI", uri4.toString());
            }
            upqVar2.J = bundle;
            tqh0 tqh0Var = new tqh0(upqVar2);
            String str6 = j2i0Var2.a;
            koh0 koh0Var = new koh0();
            str6.getClass();
            koh0Var.b = str6;
            koh0Var.c(str6);
            koh0Var.k = tqh0Var;
            yoh0 yoh0VarA = koh0Var.a();
            mv81 mv81Var = new mv81(Long.valueOf(r4z0Var.b + ((long) i)));
            mv81Var.c = yoh0VarA;
            long j2 = j2i0Var2.i.b;
            dm5.m(j2 == -9223372036854775807L || j2 >= 0);
            mv81Var.m = j2;
            arrayList.add(new nv81(mv81Var));
            i = i2;
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            dm5.n(hashSet.add(((nv81) arrayList.get(i3)).a), "Duplicate MediaItemData UID in playlist");
        }
        tv81Var.v = b380.p(arrayList);
        tv81Var.w = new qv81(tv81Var.v);
        tv81Var.x = null;
        tv81Var.y = null;
    }

    @Override // p.vv81
    public final void p1(int i) {
        zud0 zud0Var = this.f166p;
        if (zud0Var != null) {
            oqh0 oqh0Var = (oqh0) zud0Var.b;
            av7 av7Var = oqh0Var.r;
            if (av7Var != null) {
                av7Var.i(i);
            } else {
                int i2 = oqh0Var.a.y0().c;
                if (i2 > 0) {
                    ark1.g(oqh0Var.l, ((double) i) / ((double) i2), "media_session", (String) null, 12);
                }
            }
        }
        f280 f280Var = f280.b;
    }

    public final String y1() {
        String str = (String) this.n.invoke();
        if (str == null) {
            n57.s("Package name is not available");
        }
        return str;
    }
}
