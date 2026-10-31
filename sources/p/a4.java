package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a4 implements acr0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public a4(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.f1);
                break;
            case 2:
                this.b = Collections.singleton(blc0.J1);
                break;
            case 3:
                this.b = Collections.singleton(blc0.W2);
                break;
            case 4:
                this.b = Collections.singleton(blc0.i6);
                break;
            case 5:
                this.b = Collections.singleton(blc0.Sc);
                break;
            case 6:
                this.b = Collections.singleton(blc0.b8);
                break;
            case 7:
                this.b = Collections.singleton(blc0.e1);
                break;
            case 8:
                this.b = Collections.singleton(blc0.Wb);
                break;
            case 9:
                this.b = Collections.singleton(blc0.Za);
                break;
            case 10:
                this.b = Collections.singleton(blc0.ze);
                break;
            case 11:
                this.b = Collections.singleton(blc0.Oh);
                break;
            case 12:
                this.b = Collections.singleton(blc0.Lh);
                break;
            case 13:
                this.b = Collections.singleton(blc0.lj);
                break;
            case 14:
                this.b = Collections.singleton(blc0.wj);
                break;
            case 15:
                this.b = Collections.singleton(blc0.xj);
                break;
            default:
                this.b = Collections.singleton(blc0.Fh);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Set) obj;
            case 1:
                return (Set) obj;
            case 2:
                return (Set) obj;
            case 3:
                return (Set) obj;
            case 4:
                return (Set) obj;
            case 5:
                return (Set) obj;
            case 6:
                return (Set) obj;
            case 7:
                return (Set) obj;
            case 8:
                return (Set) obj;
            case 9:
                return (Set) obj;
            case 10:
                return (Set) obj;
            case 11:
                return (Set) obj;
            case 12:
                return (Set) obj;
            case 13:
                return (Set) obj;
            case 14:
                return (Set) obj;
            case 15:
                return (Set) obj;
            default:
                return Collections.singleton(blc0.Wc);
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return y3.class;
            case 1:
                return o03.class;
            case 2:
                return zq6.class;
            case 3:
                return ske.class;
            case 4:
                return oit.class;
            case 5:
                return xrt.class;
            case 6:
                return b890.class;
            case 7:
                return arj0.class;
            case 8:
                return pgo0.class;
            case 9:
                return mpw0.class;
            case 10:
                return mpx0.class;
            case 11:
                return yxa1.class;
            case 12:
                return emf1.class;
            case 13:
                return ocj1.class;
            case 14:
                return bxk1.class;
            case 15:
                return hyk1.class;
            default:
                return t3p0.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        ArrayList<String> stringArrayList;
        String string;
        ast astVar;
        brj0 brj0Var;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3 = 1;
        String str6 = "";
        hwk1 hwk1Var = null;
        Object obj = null;
        switch (this.a) {
            case 0:
                String strZ = s4b1Var.z();
                return new z3(strZ != null ? strZ : "");
            case 1:
                r03 parcelableExtra = intent.getParcelableExtra("ai_disclosure_sheet_params");
                return parcelableExtra == null ? new r03("prompted_playlists") : parcelableExtra;
            case 2:
                Bundle extras = intent.getExtras();
                if (extras != null && (string = extras.getString("TITLE")) != null) {
                    str6 = string;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null || (stringArrayList = extras2.getStringArrayList("ARTIST_URI_LIST")) == null) {
                    stringArrayList = z6x.a;
                }
                return new br6(str6, stringArrayList);
            case 3:
                Bundle extras3 = intent.getExtras();
                if (extras3 == null) {
                    String strZ2 = s4b1Var.z();
                    return new lke("spotify:episode:".concat(ihc1.H0(strZ2 != null ? strZ2 : "", "spotify:internal:chapters:sheet:episode:")), (String) null, (String) null);
                }
                Object objT = jhc1.t(extras3, "chapterselector.args", lke.class);
                if (objT != null) {
                    return (lke) objT;
                }
                hhg1.n("No chapter selector arguments in bundle.");
                return null;
            case 4:
                return new qit();
            case 5:
                Bundle extras4 = intent.getExtras();
                if (extras4 == null || (astVar = (ast) jhc1.t(extras4, "device_location_permission_page_input", ast.class)) == null) {
                    astVar = new ast((bst) null, (n27) null, 15);
                }
                return new dst(astVar.a, astVar.b, astVar.c, astVar.d);
            case 6:
                Uri uri = s4b1Var.a;
                String queryParameter = uri != null ? uri.getQueryParameter("adSlot") : null;
                if (queryParameter == null) {
                    hhg1.f(h4b1.d(uri, "Missing required 'adSlot' query parameter in "));
                    return null;
                }
                String queryParameter2 = uri != null ? uri.getQueryParameter("postAction") : null;
                if (queryParameter2 != null) {
                    return new d890(queryParameter, queryParameter2, uri != null ? uri.getQueryParameter("destinationUri") : null);
                }
                hhg1.f(h4b1.d(uri, "Missing required 'postAction' query parameter in "));
                return null;
            case 7:
                String stringExtra = intent.getStringExtra("mic_permission_page_consumer");
                if (stringExtra != null) {
                    for (Object obj2 : brj0.e) {
                        if (u890.j(((brj0) obj2).name(), stringExtra)) {
                            obj = obj2;
                            brj0Var = (brj0) obj;
                            if (brj0Var == null) {
                                brj0Var = brj0.a;
                            }
                        }
                    }
                    brj0Var = (brj0) obj;
                    if (brj0Var == null) {
                        brj0Var = brj0.a;
                    }
                } else {
                    brj0Var = brj0.a;
                }
                return new erj0(brj0Var);
            case 8:
                Bundle extras5 = intent.getExtras();
                vqr0 vqr0Var = extras5 != null ? (vqr0) extras5.getParcelable("not_interested_followup_input") : null;
                if (vqr0Var == null) {
                    vqr0Var = null;
                }
                String str7 = (vqr0Var == null || (str4 = vqr0Var.a) == null) ? "" : str4;
                String str8 = (vqr0Var == null || (str3 = vqr0Var.b) == null) ? "" : str3;
                String str9 = (vqr0Var == null || (str2 = vqr0Var.c) == null) ? "" : str2;
                int i4 = (vqr0Var == null || (i = vqr0Var.d) == 0) ? 1 : i;
                if (vqr0Var == null || (str = vqr0Var.e) == null) {
                    str = "home-promotion";
                }
                String str10 = str;
                String str11 = vqr0Var != null ? vqr0Var.f : null;
                return new rgo0(str7, str8, str9, str10, i4, str11 == null ? "" : str11, vqr0Var != null ? vqr0Var.g : null);
            case 9:
                Bundle extras6 = intent.getExtras();
                zqr0 zqr0Var = extras6 != null ? (zqr0) extras6.getParcelable("privacy_result") : null;
                return new opw0(zqr0Var != null ? zqr0Var.a : false);
            case 10:
                Bundle extras7 = intent.getExtras();
                arr0 arr0Var = extras7 != null ? (arr0) extras7.getParcelable("prompt_bottom_sheet_input") : null;
                if (arr0Var == null) {
                    arr0Var = null;
                }
                if (arr0Var != null && (str5 = arr0Var.a) != null) {
                    str6 = str5;
                }
                String str12 = arr0Var != null ? arr0Var.b : null;
                if (arr0Var != null && (i2 = arr0Var.c) != 0) {
                    i3 = i2;
                }
                return new opx0(i3, str6, str12);
            case 11:
                fya1 parcelableExtra2 = intent.getParcelableExtra("split_browser_parameters");
                parcelableExtra2.getClass();
                return parcelableExtra2;
            case 12:
                String strZ3 = s4b1Var.z();
                str6 = strZ3 != null ? strZ3 : "";
                return new fmf1("spotify:track:".concat(ihc1.J0(ihc1.H0(str6, "spotify:internal:track:"), ":dna:report")), str6);
            case 13:
                rcj1 parcelableExtra3 = intent.getParcelableExtra("video_ad_overlay_parameters");
                parcelableExtra3.getClass();
                return parcelableExtra3;
            case 14:
                String stringExtra2 = intent.getStringExtra("voting-playlist-uri");
                if (stringExtra2 == null || stringExtra2.length() == 0) {
                    hhg1.n("V2 voting requires a playlist URI. The entry point must pass it via the voting-playlist-uri intent extra.");
                } else {
                    String strZ4 = s4b1Var.z();
                    hwk1Var = new hwk1(strZ4 != null ? strZ4 : "", stringExtra2);
                }
                return hwk1Var;
            case 15:
                return new iyk1(fq7.H("voting-share-page-v2-contest-id", intent), fq7.H("voting-share-page-v2-award-id", intent), intent.getByteArrayExtra("voting-share-page-v2-response"), fq7.H("voting-share-page-v2-playlist-uri", intent));
            default:
                return aqr0.a;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return new b6w0(true);
            case 2:
                return new b6w0(false);
            case 3:
                return new b6w0(true);
            case 4:
                return new b6w0(false);
            case 5:
                return new c6w0(1, true, (hd5) null, 12);
            case 6:
                return new c6w0(1, false, (hd5) null, 14);
            case 7:
                return new c6w0(1, true, (hd5) null, 12);
            case 8:
                return new b6w0(true);
            case 9:
                return new b6w0(true);
            case 10:
                return new b6w0(true);
            case 11:
                return new c6w0(1, false, (hd5) null, 14);
            case 12:
                return new b6w0(true);
            case 13:
                return new c6w0(3, false, (hd5) null, 14);
            case 14:
                return new c6w0(1, false, fd5.c, 8);
            case 15:
                return a6w0.a;
            default:
                return new c6w0(3, false, ed5.c, 10);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Bottom sheet for About SongDNA legal disclaimer";
            case 1:
                return "Bottom sheet displaying an AI disclosure with configurable content";
            case 2:
                return "Page that displays a list of artists for a given entity";
            case 3:
                return "Bottom sheet for selecting a chapter";
            case 4:
                return "Desktop Launcher QR code bottom sheet";
            case 5:
                return "Page for requesting device location permission from user";
            case 6:
                return "Plays an interrupting video ad. The ad slot and post-playback action are specified via query parameters.";
            case 7:
                return "Microphone permission page";
            case 8:
                return "Bottom sheet offering to show less from a dismissed card's parent";
            case 9:
                return "Bottom sheet where the user can adjust the privacy setting of a promptable playlist.";
            case 10:
                return "Bottom sheet for prompt entry";
            case 11:
                return "Split-screen video ad browser";
            case 12:
                return "Bottom sheet for reporting track credits in SongDNA context";
            case 13:
                return "Fullscreen video ad overlay page";
            case 14:
                return "Voting root V2";
            case 15:
                return "Voting Share V2";
            default:
                return "Now Playing Fullscreen Page";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return ((gv4) ((kly0) this.b).get()).b();
        }
    }

    public a4(caq caqVar) {
        this.a = (byte) 16;
        this.b = caqVar;
    }
}
