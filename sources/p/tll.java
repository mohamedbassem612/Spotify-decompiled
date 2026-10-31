package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tll implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public tll(xrk xrkVar) {
        this.a = (byte) 2;
        this.c = xrkVar;
        this.b = dm61.z0(blc0.BROWSE_CONCERTS, blc0.BROWSE_CONCERTS_LOCATION, blc0.BROWSE_CONCERTS_GENRE, blc0.BROWSE_CONCERTS_LOCATION_GENRE);
    }

    @Override // p.acr0
    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    @Override // p.acr0
    public final Class b() {
        switch (this.a) {
            case 0:
                return qll.class;
            case 1:
                return rez.class;
            case 2:
                return uh00.class;
            case 3:
                return lh50.class;
            case 4:
                return k7g0.class;
            case 5:
                return awo0.class;
            case 6:
                return mw11.class;
            default:
                return vgf1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        jj40 jj40Var;
        p5k p5kVar;
        String strO;
        String strO2;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        switch (b) {
            case 0:
                String strZ = s4b1Var.z();
                if (strZ == null) {
                    strZ = "";
                }
                String strJ = s4b1Var.j();
                return new sll(strZ, strJ != null ? strJ : "", oon1.q(s4b1Var));
            case 1:
                Set set = s4b1.f;
                String strK = zjy.k(intent);
                return new xez(strK != null ? strK : "");
            case 2:
                blc0 blc0Var = s4b1Var.c;
                Set set2 = s4b1.f;
                String strK2 = zjy.k(intent);
                if (strK2 == null) {
                    strK2 = "";
                }
                String str = th61Var.a;
                int iOrdinal = blc0Var.ordinal();
                ArrayList arrayList = null;
                if (iOrdinal == 107) {
                    String strJ2 = s4b1Var.j();
                    if (strJ2 != null) {
                        List listQ0 = ihc1.Q0(strJ2, new String[]{"-"}, 2, 2);
                        String str2 = (String) o7h.t0(0, listQ0);
                        int i = str2 != null ? Integer.parseInt(str2) : -1;
                        String str3 = (String) o7h.t0(1, listQ0);
                        jj40Var = new jj40(str3 != null ? o7h.y0(ihc1.Q0(str3, new String[]{"-"}, 0, 6), " ", null, null, null, 62) : "", i);
                    } else {
                        jj40Var = null;
                    }
                } else if (iOrdinal == 108 && (strO2 = s4b1Var.o(2)) != null) {
                    jj40Var = new jj40("", Integer.parseInt(strO2));
                } else {
                    jj40Var = null;
                }
                int iOrdinal2 = blc0Var.ordinal();
                if (iOrdinal2 == 106) {
                    String strJ3 = s4b1Var.j();
                    if (strJ3 != null) {
                        List listQ1 = ihc1.Q0(strJ3, new String[]{"-"}, 2, 2);
                        String strZ2 = uic.f((String) listQ1.get(0)).z();
                        if (strZ2 == null) {
                            strZ2 = "";
                        }
                        p5kVar = new p5k(strZ2, listQ1.size() == 2 ? o7h.y0(ihc1.Q0((CharSequence) listQ1.get(1), new String[]{"-"}, 0, 6), " ", null, null, null, 62) : "");
                    } else {
                        p5kVar = null;
                    }
                } else if (iOrdinal2 == 108 && (strO = s4b1Var.o(4)) != null) {
                    List listQ2 = ihc1.Q0(strO, new String[]{"-"}, 2, 2);
                    String strZ3 = uic.f((String) listQ2.get(0)).z();
                    if (strZ3 == null) {
                        strZ3 = "";
                    }
                    p5kVar = new p5k(strZ3, listQ2.size() == 2 ? o7h.y0(ihc1.Q0((CharSequence) listQ2.get(1), new String[]{"-"}, 0, 6), " ", null, null, null, 62) : "");
                } else {
                    p5kVar = null;
                }
                Uri uri = s4b1Var.a;
                List<String> queryParameters = uri != null ? uri.getQueryParameters("genres") : null;
                if (queryParameters != null) {
                    List<String> list = queryParameters;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                    for (String str4 : list) {
                        Set set3 = s4b1.f;
                        str4.getClass();
                        String strZ4 = uic.f(str4).z();
                        if (strZ4 == null) {
                            strZ4 = "";
                        }
                        arrayList2.add(new p5k(strZ4, ""));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (!u890.j(p5kVar != null ? p5kVar.getUri() : null, ((p5k) obj).getUri())) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = arrayList3;
                }
                List listX = p5kVar != null ? k4p1.x(p5kVar) : z6x.a;
                if (arrayList != null) {
                    listX = o7h.N0(arrayList, listX);
                }
                return new wh00(strK2, str, jj40Var, listX);
            case 3:
                Set set4 = s4b1.f;
                String strZ5 = uic.x(intent.getDataString()).z();
                strZ5.getClass();
                return new nh50(strZ5);
            case 4:
                String strO3 = s4b1Var.o(3);
                return new m7g0(strO3 != null ? strO3 : "");
            case 5:
            case 6:
            default:
                return aqr0Var;
        }
    }

    @Override // p.acr0
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Consumption Page";
            case 1:
                return "Equalizer page";
            case 2:
                return "Hub for displaying live experiences.";
            case 3:
                return "Group blend members page";
            case 4:
                return "Page for selecting what type of content to manage for a child account";
            case 5:
                return "Podcast New Episode Notifications Settings page";
            case 6:
                return "The Upcoming Releases Hub page showcasing upcoming Prereleases (CDPs) and Listening Parties (LPs)";
            default:
                return "Page with all purchased top ups";
        }
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((wpv0) obj).b.e();
            case 1:
                return ((gfz) obj).b();
            case 2:
                return ((xrk) obj).a();
            case 3:
                return ((gf4) obj).a();
            case 4:
                return ((sb40) obj).b.b();
            case 5:
                return ((oto0) obj).a.f();
            case 6:
                return ((wi4) ((kly0) obj).get()).b();
            default:
                Observable observableY = y7y0.y((o241) obj);
                Boolean bool = Boolean.FALSE;
                return ((Boolean) observableY.first(bool).onErrorReturnItem(bool).blockingGet()).booleanValue();
        }
    }

    public tll(sb40 sb40Var) {
        this.a = (byte) 4;
        this.c = sb40Var;
        this.b = Collections.singleton(blc0.PARENTAL_CONTROL_CHILD_MANAGE_CONTENT);
    }

    public tll(gfz gfzVar) {
        this.a = (byte) 1;
        this.c = gfzVar;
        this.b = Collections.singleton(blc0.EQUALIZER_SETTINGS);
    }

    public tll(oto0 oto0Var) {
        this.a = (byte) 5;
        this.c = oto0Var;
        this.b = Collections.singleton(blc0.PODCAST_NEW_EPISODE_NOTIFICATIONS_SETTINGS);
    }

    public tll(wpv0 wpv0Var) {
        this.a = (byte) 0;
        this.c = wpv0Var;
        this.b = Collections.singleton(blc0.PREMIUM_ACCOUNT_MANAGEMENT_CONSUMPTION);
    }

    public tll(gf4 gf4Var) {
        this.a = (byte) 3;
        this.c = gf4Var;
        this.b = Collections.singleton(blc0.BLEND_MEMBERS);
    }

    public tll(thq thqVar) {
        this.a = (byte) 6;
        this.c = thqVar;
        this.b = Collections.singleton(blc0.UPCOMING_RELEASES);
    }

    public tll(o241 o241Var) {
        this.a = (byte) 7;
        this.c = o241Var;
        this.b = Collections.singleton(blc0.AAA_CON_T);
    }
}
