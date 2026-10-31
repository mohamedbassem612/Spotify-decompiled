package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zm0 implements isw {
    public final /* synthetic */ byte a = 2;
    public final View b;

    public zm0(jb3 jb3Var, tnd1 tnd1Var, ViewGroup viewGroup, hp91 hp91Var) {
        this.b = ((mod1) jb3Var.c).b(viewGroup, (jto) jb3Var.d, (iu30) jb3Var.e, (iu30) jb3Var.f, tnd1Var.l(), (Function0) jb3Var.g, new qwc1(hp91Var, (byte) 7));
    }

    public final void a(Object obj, ysw yswVar) {
        switch (this.a) {
            case 0:
                this.b.setEnabled(((um0) obj).a);
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }

    public zm0(Context context) {
        View view = new View(context);
        view.setVisibility(8);
        this.b = view;
    }

    public zm0(Context context, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(2131626040, viewGroup, false);
    }

    public zm0(an0 an0Var, iu30 iu30Var) {
        AppCompatImageButton appCompatImageButton = ((cqr) voo1.m(an0Var.f)).b;
        appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131962406));
        appCompatImageButton.setOnClickListener(new v20(iu30Var, (byte) 2));
        this.b = appCompatImageButton;
    }
}
