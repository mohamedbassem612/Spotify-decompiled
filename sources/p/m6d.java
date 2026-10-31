package p;

import android.net.Uri;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m6d implements jbh0 {
    public static final m6d b = new m6d(0);
    public static final m6d c = new m6d(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ m6d(byte b2) {
        this.a = b2;
    }

    public final String description() {
        switch (this.a) {
            case 0:
                return "Matches urls in the form https://[www.|open.|r.]spotify.com/wrapped-share/* or spotify:wrapped-share:*";
            case 1:
                return "Matches Wrapped web URLs and routing URIs";
            case 2:
                return "a Spotify Link with LIVE_ROOM LinkType";
            case 3:
                return "of URI type " + byu0.f;
            case 4:
                return "List Route Group matcher";
            case 5:
                return "Managed account allowlisting requests web URL matcher";
            default:
                return "Account linking parent accept invite URL matcher";
        }
    }

    public final boolean match(Object obj) {
        mbh0 mbh0VarD;
        String str = null;
        switch (this.a) {
            case 0:
                Uri data = ((js31) obj).a.getData();
                if (data != null) {
                    if (u890.j(data.getScheme(), "http") || u890.j(data.getScheme(), "https")) {
                        List list = s6d.e;
                        if ((yoi1.E(data) || (u890.j(data.getScheme(), "https") && u890.j(data.getEncodedAuthority(), "r.spotify.com"))) && yoi1.B(data, "wrapped-share")) {
                            return true;
                        }
                    }
                    if (u890.j(data.getScheme(), "spotify")) {
                        List list2 = s6d.e;
                        String string = data.toString();
                        if (nhc1.Y(string, "spotify:wrapped-share", true) || nhc1.Y(string, "spotify://wrapped-share", true)) {
                            Set set = s4b1.f;
                            if (uic.g(string, blc0.Rj)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 1:
                Uri data2 = ((js31) obj).a.getData();
                if (data2 != null) {
                    if (u890.j(data2.getScheme(), "http") || u890.j(data2.getScheme(), "https")) {
                        List list3 = s6d.e;
                        if (yoi1.E(data2) && yoi1.B(data2, "wrapped")) {
                            return true;
                        }
                    }
                    List list4 = s6d.e;
                    if (u890.j(data2.getScheme(), "spotify")) {
                        String strY0 = ihc1.Y0(ihc1.Y0(data2.toString(), '?'), '#');
                        if (nhc1.Y(strY0, "spotify://", false)) {
                            strY0 = "spotify:".concat(strY0.substring(10));
                        }
                        int iHashCode = strY0.hashCode();
                        if (iHashCode != -512988492) {
                            if (iHashCode != 1115453481) {
                                if (iHashCode == 2037267397 && strY0.equals("spotify:wrapped")) {
                                    return true;
                                }
                            } else if (strY0.equals("spotify:internal:main-site:wrapped")) {
                                return true;
                            }
                        } else if (strY0.equals("spotify:datastories:wrapped")) {
                            return true;
                        }
                    }
                }
                return false;
            case 2:
                return blc0.ea == ((s4b1) obj).c;
            case 3:
                v5b1 v5b1Var = ((s4b1) obj).d;
                return u890.j(v5b1Var != null ? v5b1Var.getType() : null, byu0.f);
            case 4:
                Set set2 = s4b1.f;
                Set set3 = s4b1.f;
                v5b1 v5b1Var2 = ((s4b1) obj).d;
                return o7h.i0(set3, v5b1Var2 != null ? v5b1Var2.getType() : null);
            case 5:
                Uri data3 = ((js31) obj).a.getData();
                if (data3 != null && u890.j(data3.getScheme(), "https") && (u890.j(data3.getHost(), "spotify.com") || u890.j(data3.getHost(), "www.spotify.com"))) {
                    String path = data3.getPath();
                    if (path != null && (mbh0VarD = m9g0.a.d(path)) != null) {
                        str = (String) ((kbh0) mbh0VarD.a()).get(1);
                    }
                    if (str != null) {
                        return true;
                    }
                }
                return false;
            default:
                Uri data4 = ((js31) obj).a.getData();
                if (data4 != null && (u890.j(data4.getHost(), "spotify.com") || u890.j(data4.getHost(), "www.spotify.com"))) {
                    List listM = p7h.M(new String[]{"account", "parental-consent", "link-account"});
                    List listE1 = o7h.e1(4, data4.getPathSegments());
                    if (listE1.size() == 4 && o7h.d1(listE1, listM.size()).equals(listM)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
