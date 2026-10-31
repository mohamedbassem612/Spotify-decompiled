package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fsm implements acr0 {
    public final /* synthetic */ byte a;
    public final oum b;
    public final Set c;

    public fsm(oum oumVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = oumVar;
                this.c = Collections.singleton(blc0.K5);
                break;
            case 2:
                this.b = oumVar;
                this.c = Collections.singleton(blc0.L5);
                break;
            case 3:
                this.b = oumVar;
                this.c = f46.S0(new blc0[]{blc0.I5, blc0.J5});
                break;
            case 4:
                this.b = oumVar;
                this.c = Collections.singleton(blc0.N5);
                break;
            default:
                this.b = oumVar;
                this.c = Collections.singleton(blc0.M5);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return csm.class;
            case 1:
                return btm.class;
            case 2:
                return ftm.class;
            case 3:
                return mtm.class;
            default:
                return wtm.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        stm qtmVar;
        switch (this.a) {
            case 0:
                String strZ = s4b1Var.z();
                if (strZ == null) {
                    strZ = "";
                }
                String strO = s4b1Var.o(3);
                if (strO == null) {
                    strO = "";
                }
                String strConcat = "spotify:contribution:".concat(strO);
                String strN = s4b1Var.n("author_name");
                if (strN == null) {
                    strN = "";
                }
                String strN2 = s4b1Var.n("creator_uri");
                return new esm(strZ, strConcat, strN, strN2 != null ? strN2 : "");
            case 1:
                String strZ2 = s4b1Var.z();
                String str = strZ2 == null ? "" : strZ2;
                String strO2 = s4b1Var.o(3);
                String str2 = strO2 == null ? "" : strO2;
                String strN3 = s4b1Var.n("list_item_id");
                String strN4 = s4b1Var.n("context_uri");
                String str3 = strN4 == null ? "" : strN4;
                String strN5 = s4b1Var.n("item_uri");
                return new etm(str, str2, str3, strN5 == null ? "" : strN5, strN3);
            case 2:
                String strZ3 = s4b1Var.z();
                if (strZ3 == null) {
                    strZ3 = "";
                }
                String strN6 = s4b1Var.n("context_uri");
                if (strN6 == null) {
                    strN6 = "";
                }
                String strN7 = s4b1Var.n("item_uri");
                return new htm(strZ3, strN6, strN7 != null ? strN7 : "", s4b1Var.n("list_item_id"));
            case 3:
                blc0 blc0Var = s4b1Var.c;
                String str4 = th61Var.a;
                String strZ4 = s4b1Var.z();
                String str5 = strZ4 == null ? "" : strZ4;
                Set set = s4b1.f;
                String strZ5 = uic.C(str4, (String) null).z();
                if (strZ5 == null) {
                    strZ5 = l1d.m("spotify:user:", Uri.encode(str4));
                }
                String str6 = strZ5;
                int iOrdinal = blc0Var.ordinal();
                if (iOrdinal == 266) {
                    String strN8 = s4b1Var.n("context_uri");
                    String str7 = strN8 == null ? "" : strN8;
                    String strN9 = s4b1Var.n("item_uri");
                    qtmVar = new qtm(str5, str7, strN9 == null ? "" : strN9, s4b1Var.n("list_item_id"), str6);
                } else {
                    if (iOrdinal != 267) {
                        hhg1.g(blc0Var, "Unsupported link type: ");
                        return null;
                    }
                    String strN10 = s4b1Var.n("context_uri");
                    String str8 = strN10 == null ? "" : strN10;
                    String strN11 = s4b1Var.n("item_uri");
                    qtmVar = new stm(str5, str8, strN11 == null ? "" : strN11, s4b1Var.n("list_item_id"), str6);
                }
                return qtmVar;
            default:
                String strZ6 = s4b1Var.z();
                if (strZ6 == null) {
                    strZ6 = "";
                }
                String strN12 = s4b1Var.n("context_uri");
                if (strN12 == null) {
                    strN12 = "";
                }
                String strN13 = s4b1Var.n("item_uri");
                return new ytm(strZ6, strN12, strN13 != null ? strN13 : "", s4b1Var.n("list_item_id"));
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return new b6w0(false);
            case 2:
                return new b6w0(true);
            case 3:
                return new b6w0(true);
            default:
                return new b6w0(true);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Bottom sheet showing the report action for a specific note";
            case 1:
                return "Bottom sheet for managing a contribution note (edit or remove)";
            case 2:
                return "Bottom sheet listing all notes for collaborator management";
            case 3:
                return "Bottom sheet for creating or editing a contribution note";
            default:
                return "Bottom sheet listing reportable notes on a playlist item";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.b.a;
    }
}
