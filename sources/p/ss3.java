package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ss3 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public ss3(ay4 ay4Var) {
        this.a = (byte) 10;
        this.c = ay4Var;
        this.b = f46.S0(new blc0[]{blc0.kd, blc0.jd, blc0.fd, blc0.hd, blc0.id, blc0.gd});
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ps3.class;
            case 1:
                return ho5.class;
            case 2:
                return yv6.class;
            case 3:
                return ay7.class;
            case 4:
                return dml.class;
            case 5:
                return l1m.class;
            case 6:
                return oi50.class;
            case 7:
                return tuf0.class;
            case 8:
                return din0.class;
            case 9:
                return m9o0.class;
            case 10:
                return h3v0.class;
            case 11:
                return o7v0.class;
            default:
                return bcc1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x016b  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        EntryPoint entryPointA;
        Object next;
        mo5 mo5Var;
        String strB;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        String strC = "";
        do5 do5Var = null;
        switch (b) {
            case 0:
                int iOrdinal = s4b1Var.c.ordinal();
                if (iOrdinal == 473) {
                    entryPointA = EntryPoint.DEFAULT;
                } else if (iOrdinal == 914) {
                    entryPointA = EntryPoint.HOME_ARTIST_HEADER;
                } else if (iOrdinal != 915) {
                    wzy wzyVar = EntryPoint.Companion;
                    String strJ = s4b1Var.j();
                    wzyVar.getClass();
                    entryPointA = wzy.a(strJ);
                } else {
                    entryPointA = EntryPoint.LIBRARY_ADD_ARTISTS;
                }
                return new rs3(entryPointA);
            case 1:
                String strJ2 = s4b1Var.j();
                if (strJ2 != null) {
                    Iterator it = o7h.l1((Iterable) ((dva) this.c).a.get()).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            do5 do5Var2 = ((mo5) next).a;
                        } else {
                            next = null;
                        }
                        mo5Var = (mo5) next;
                        if (mo5Var != null) {
                            do5Var = mo5Var.a;
                        }
                    } while (!"default".equals(strJ2));
                    mo5Var = (mo5) next;
                    if (mo5Var != null) {
                        do5Var = mo5Var.a;
                    }
                }
                return new jo5(do5Var);
            case 2:
                blc0 blc0Var = s4b1Var.c;
                int[] iArr = gw6.a;
                if (iArr[blc0Var.ordinal()] == 1) {
                    strB = "spotify:artist:".concat(s4b1Var.h());
                } else {
                    strB = s4b1Var.b();
                    if (strB == null) {
                        strB = "";
                    }
                }
                int i = iArr[blc0Var.ordinal()];
                jx11 jx11Var = jx11.d;
                if (i == 1) {
                    strC = jx11Var.c(s4b1Var.h());
                } else {
                    Set set = s4b1.f;
                    String strK = zjy.k(intent);
                    if (strK != null) {
                        strC = strK;
                    }
                }
                int iOrdinal2 = blc0Var.ordinal();
                if (iOrdinal2 != 60) {
                    jx11Var = iOrdinal2 != 66 ? jx11.b : jx11.c;
                }
                return new fw6(strC, strB, jx11Var);
            case 3:
                return hy7.a;
            case 4:
                return aqr0Var;
            case 5:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    hhg1.n("Chat URI cannot be null");
                    return null;
                }
                Set set2 = s4b1.f;
                String strB2 = pcf.b(uic.x(intent.getDataString()));
                if (strB2 != null) {
                    return new n1m(dataString, strB2);
                }
                hhg1.n("Chat ID cannot be null");
                return null;
            case 6:
                return new qi50(intent.getParcelableExtra("SELECTED_GROUP_ITEM"), s4b1Var.j(), String.valueOf(intent.getData()));
            case 7:
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                return new wuf0(extras);
            case 8:
                return aqr0Var;
            case 9:
                String str = th61Var.a;
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    extras2 = Bundle.EMPTY;
                }
                extras2.getClass();
                return new o9o0(str, extras2);
            case 10:
                return new j3v0(d7p1.m(s4b1Var), s4b1Var.c == blc0.kd);
            case 11:
                Set set3 = s4b1.f;
                String strZ = uic.z(s4b1Var.h()).z();
                if (strZ != null) {
                    return new r7v0(strZ, th61Var.a);
                }
                hhg1.n("Required value was null.");
                return null;
            default:
                kik1 kik1Var = nik1.r;
                String strZ2 = s4b1Var.z();
                if (strZ2 == null) {
                    strZ2 = "";
                }
                lik1 lik1VarB = kik1Var.b(strZ2);
                String strO = s4b1Var.o(4);
                String str2 = strO == null ? "" : strO;
                String strO2 = s4b1Var.o(5);
                return new pcc1(str2, strO2 == null ? "" : strO2, intent.getStringExtra("playlist_image_uri_intent_key"), intent.getStringExtra("session_id_intent_key"), intent.getStringExtra("message_id_intent_key"), lik1VarB);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Taste onboarding (allboarding) host page";
            case 1:
                return "Page that displays app icons";
            case 2:
                return "Page that shows an artist's releases and songs";
            case 3:
                return "Audio params test page";
            case 4:
                return "Informs the consumption hours for audiobook premium";
            case 5:
                return "A stickers page for picking content to share in a chat";
            case 6:
                return "Page API implementation of group notification categories";
            case 7:
                return "Display the Made for You hub page";
            case 8:
                return "A page for viewing the child's own allowlisting requests";
            case 9:
                return "New episodes page";
            case 10:
                return "Podcast charts page";
            case 11:
                return "Handles routing to the Show settings page";
            default:
                return "Search-to-prompt loading page";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((ul4) ((kly0) obj).get()).h();
            case 1:
                return false;
            case 2:
                return ((f54) obj).c();
            case 3:
                return ((zx7) obj).a;
            case 4:
                Observable observableY = y7y0.y((o241) obj);
                Boolean bool = Boolean.FALSE;
                return ((Boolean) observableY.first(bool).onErrorReturnItem(bool).blockingGet()).booleanValue();
            case 5:
                return ((add) obj).g();
            case 6:
                return ((oto0) obj).a.d();
            case 7:
                hr4 hr4Var = (hr4) obj;
                return hr4Var.b() && !hr4Var.a();
            case 8:
                return ((sb40) obj).b.i();
            case 9:
                return ((pu4) obj).a();
            case 10:
                return ((ay4) obj).a();
            case 11:
                return ((jy4) obj).b();
            default:
                return ((di4) obj).w();
        }
    }

    public ss3(f54 f54Var) {
        this.a = (byte) 2;
        this.c = f54Var;
        this.b = f46.S0(new blc0[]{blc0.O1, blc0.Q1, blc0.K1});
    }

    public ss3(jy4 jy4Var) {
        this.a = (byte) 11;
        this.c = jy4Var;
        this.b = Collections.singleton(blc0.eh);
    }

    public ss3(di4 di4Var) {
        this.a = (byte) 12;
        this.c = di4Var;
        this.b = Collections.singleton(blc0.Jf);
    }

    public ss3(hr4 hr4Var) {
        this.a = (byte) 7;
        this.c = hr4Var;
        this.b = f46.S0(new blc0[]{blc0.Qa, blc0.a6});
    }

    public ss3(pu4 pu4Var) {
        this.a = (byte) 9;
        this.c = pu4Var;
        this.b = f46.S0(new blc0[]{blc0.k4, blc0.l4, blc0.z4, blc0.y4});
    }

    public ss3(zx7 zx7Var) {
        this.a = (byte) 3;
        this.c = zx7Var;
        this.b = Collections.singleton(blc0.Ng);
    }

    public ss3(dva dvaVar, ybx0 ybx0Var) {
        this.a = (byte) 1;
        this.c = dvaVar;
        this.b = f46.S0(new blc0[]{blc0.p1, blc0.q1});
    }

    public ss3(add addVar) {
        this.a = (byte) 5;
        this.c = addVar;
        this.b = Collections.singleton(blc0.v3);
    }

    public ss3(sb40 sb40Var) {
        this.a = (byte) 8;
        this.c = sb40Var;
        this.b = Collections.singleton(blc0.Ib);
    }

    public ss3(caq caqVar) {
        this.a = (byte) 0;
        this.c = caqVar;
        this.b = f46.S0(new blc0[]{blc0.l1, blc0.hi, blc0.ii, blc0.H9});
    }

    public ss3(oto0 oto0Var) {
        this.a = (byte) 6;
        this.c = oto0Var;
        this.b = Collections.singleton(blc0.Ub);
    }

    public ss3(o241 o241Var) {
        this.a = (byte) 4;
        this.c = o241Var;
        this.b = Collections.singleton(blc0.c);
    }
}
