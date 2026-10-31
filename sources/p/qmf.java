package p;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qmf implements acr0 {
    public final /* synthetic */ byte a;
    public final add b;
    public final Set c;

    public qmf(add addVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = addVar;
                this.c = Collections.singleton(blc0.y3);
                break;
            default:
                this.b = addVar;
                this.c = Collections.singleton(blc0.z3);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return nmf.class;
            default:
                return smf.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String strJ = s4b1Var.j();
                if (strJ == null) {
                    strJ = "";
                }
                Set set = pcf.a;
                return new pmf(strJ, "spotify:chat-settings-consolidated:".concat(strJ), th61Var.a);
            default:
                String strB = pcf.b(s4b1Var);
                if (strB != null) {
                    return new umf(strB, s4b1Var.l(), th61Var.a);
                }
                hhg1.n("Chat ID cannot be null");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return a6w0.a;
            default:
                return new b6w0(false);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "Full-screen consolidated chat settings page";
            default:
                return "A bottom sheet page for per-chat privacy settings";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        add addVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qf4 qf4Var = addVar.a;
                return qf4Var.h() && qf4Var.M();
            default:
                return addVar.b();
        }
    }
}
