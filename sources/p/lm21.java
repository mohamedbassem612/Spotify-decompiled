package p;

import android.content.Context;
import android.content.Intent;
import android.net.MailTo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/lm21;", "Lp/ijl1;", "<init>", "()V", "src_main_java_com_spotify_reporting_reportaction-reportaction"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class lm21 extends ijl1 {
    public static final /* synthetic */ int Y1 = 0;
    public g341 V1;
    public Disposable W1;
    public String X1;

    public final void A0() {
        ((zf30) this).h1 = true;
        Disposable disposable = this.W1;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void I0(View view, Bundle bundle) {
        view.setOnApplyWindowInsetsListener(ouz0.c);
        Toolbar toolbarFindViewById = view.findViewById(2131430661);
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null) {
            eg.m("Activity cannot be null");
        } else {
            toolbarFindViewById.setNavigationIcon(new g4b1(dg30VarF0, j4b1.X, k0().getDimensionPixelSize(2131167143)));
            toolbarFindViewById.setNavigationOnClickListener(new hid0(this, (byte) 24));
        }
    }

    public final int Z0() {
        return 2131625589;
    }

    public final boolean b1(Uri uri) {
        if (!MailTo.isMailTo(uri.toString())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SEND", uri);
        intent.setType("application/octet-stream");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{MailTo.parse(uri.toString()).getTo()});
        X0(intent);
        return true;
    }

    public final void c1() {
        if (((ijl1) this).H1 == null) {
            n57.e("Can't set URI when view is detached.");
            return;
        }
        String str = this.X1;
        if (str == null) {
            u890.C("reportingUrl");
            throw null;
        }
        Uri uri = Uri.parse(str);
        Disposable disposable = this.W1;
        if (disposable != null) {
            disposable.dispose();
        }
        g341 g341Var = this.V1;
        if (g341Var != null) {
            this.W1 = g341Var.c(uri).onErrorReturnItem(uri).subscribe((Consumer) new lyw0(this, (byte) 27));
        } else {
            u890.C("webToken");
            throw null;
        }
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.zf30*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 != null) {
            String string = bundle2.getString("report_web_view_url");
            if (string == null) {
                string = "";
            }
            this.X1 = string;
        }
        W0();
        N0().J().a(this, new ydb(this, (byte) 25));
    }
}
