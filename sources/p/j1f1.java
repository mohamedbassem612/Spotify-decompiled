package p;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/j1f1;", "Lp/dwb;", "<init>", "()V", "src_main_java_com_spotify_login_magiclink-magiclink"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class j1f1 extends dwb {
    public lde0 V1;
    public bvw W1;
    public qhe0 X1;
    public xdl0 Y1;
    public mwn0 Z1;
    public ohv0 a2;

    public final int b1() {
        return 2132017725;
    }

    public final Dialog c1(Bundle bundle) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(P0()).inflate(2131626261, (ViewGroup) null, false);
        int i = 2131427858;
        Button button = (Button) m5n1.t(constraintLayoutInflate, 2131427858);
        if (button != null) {
            i = 2131427862;
            Button button2 = (Button) m5n1.t(constraintLayoutInflate, 2131427862);
            if (button2 != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                int i2 = 2131429743;
                View viewT = m5n1.t(constraintLayoutInflate, 2131429743);
                if (viewT != null) {
                    i2 = 2131430698;
                    View viewT2 = m5n1.t(constraintLayoutInflate, 2131430698);
                    if (viewT2 != null) {
                        i2 = 2131431270;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431270);
                        if (textView != null) {
                            i2 = 2131431271;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431271);
                            if (textView2 != null) {
                                i2 = 2131431272;
                                if (((TextView) m5n1.t(constraintLayoutInflate, 2131431272)) != null) {
                                    String string = O0().getString("arg_email");
                                    string.getClass();
                                    if (this.V1 == null) {
                                        u890.C("emailValidator");
                                        throw null;
                                    }
                                    if (lde0.a(string) != 1) {
                                        textView.setText(Html.fromHtml(P0().getString(2131958024), 0));
                                    } else {
                                        textView.setText(Html.fromHtml(P0().getString(2131958023, string), 0));
                                    }
                                    button2.setOnClickListener(new i1f1(this, (byte) 0));
                                    if (this.W1 == null) {
                                        u890.C("emailClientLauncher");
                                        throw null;
                                    }
                                    PackageManager packageManager = P0().getPackageManager();
                                    Intent intent = new Intent("android.intent.action.MAIN");
                                    intent.addCategory("android.intent.category.APP_EMAIL");
                                    intent.setFlags(268435456);
                                    if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                                        button2.setVisibility(8);
                                        textView2.setVisibility(8);
                                        viewT.setVisibility(8);
                                        viewT2.setVisibility(8);
                                    }
                                    button.setOnClickListener(new i1f1(this, (byte) 1));
                                    cwb cwbVar = new cwb(P0(), 2132017725);
                                    cwbVar.setContentView(constraintLayout);
                                    return cwbVar;
                                }
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }
}
