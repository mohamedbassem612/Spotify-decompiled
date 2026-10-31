package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vo8 implements acr0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ vo8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Set a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((f25) ((vn8) obj).a.get()).a() ? Collections.singleton(blc0.m2) : w7x.a;
            default:
                xj61 xj61Var = new xj61();
                if (!((f54) obj).c()) {
                    xj61Var.add(blc0.O1);
                }
                xj61Var.add(blc0.T1);
                xj61Var.add(blc0.p2);
                return cwl1.j(xj61Var);
        }
    }

    public final Class b() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return po8.class;
            default:
                return ax11.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        xwn wwnVar;
        String strZ;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String strE = s4b1Var.E();
                return new to8(strE != null ? strE : "", th61Var.a);
            default:
                blc0 blc0Var = s4b1Var.c;
                Set set = s4b1.f;
                String strK = zjy.k(intent);
                if (strK == null) {
                    strK = "";
                }
                int iOrdinal = blc0Var.ordinal();
                if (iOrdinal == 64) {
                    String strB = s4b1Var.b();
                    wwnVar = new wwn(strB != null ? strB : "");
                } else {
                    if (iOrdinal != 69) {
                        if (iOrdinal == 91) {
                            Uri uri = s4b1Var.a;
                            int iOrdinal2 = blc0Var.ordinal();
                            if (iOrdinal2 == 88) {
                                strZ = s4b1Var.z();
                            } else if (iOrdinal2 == 90 || iOrdinal2 == 91) {
                                strZ = s4b1Var.z();
                                if (strZ != null) {
                                    String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
                                    if (lastPathSegment != null) {
                                        strZ = strZ.substring(0, ihc1.B0(strZ, lastPathSegment, 0, 6) - 1);
                                    }
                                } else {
                                    hhg1.n("Required value was null.");
                                }
                            } else {
                                uh61.i(uri, "\" is not author related");
                            }
                            wwnVar = new xwn(strZ != null ? strZ : "");
                        } else {
                            eg.m("Link type doesn't match with any Creator link type");
                        }
                        return null;
                    }
                    String strB2 = s4b1Var.b();
                    wwnVar = new ywn(strB2 != null ? strB2 : "");
                }
                return new kx11(strK, wwnVar, th61Var.a);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "Author page";
            default:
                return "Page that shows artists or author releases";
        }
    }
}
