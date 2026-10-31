package p;

import android.content.res.Resources;
import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i71 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt91 b;
    public final /* synthetic */ Resources c;

    public /* synthetic */ i71(kt91 kt91Var, Resources resources, byte b) {
        this.a = b;
        this.b = kt91Var;
        this.c = resources;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Resources resources = this.c;
        kt91 kt91Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kt91Var.k(new er91((fs91) null, resources.getString(2131951911), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91Var.k(new er91((fs91) null, resources.getString(2131958473), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
