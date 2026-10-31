package com.spotify.allboarding.allboardingimpl.skip;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import kotlin.Metadata;
import p.edr0;
import p.eg;
import p.f46;
import p.i8h1;
import p.j591;
import p.kw6;
import p.m3h1;
import p.n3h1;
import p.o3h1;
import p.p691;
import p.p791;
import p.t2u;
import p.u890;
import p.wa21;
import p.yg30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/skip/SkipDialogFragment;", "Lp/t2u;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "p/j591", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SkipDialogFragment extends t2u {
    public final yg30 V1;
    public i8h1 W1;
    public edr0 X1;
    public n3h1 Y1;
    public p791 Z1;

    public SkipDialogFragment(yg30 yg30Var) {
        this.V1 = yg30Var;
    }

    public final void I0(View view, Bundle bundle) {
        j591 j591Var;
        String string = O0().getString("allboarding-step-arg", "");
        String str = string != null ? string : "";
        n3h1 n3h1Var = this.Y1;
        if (n3h1Var == null) {
            u890.C("skipDialogLogger");
            throw null;
        }
        n3h1Var.a(str);
        p791 p791Var = this.Z1;
        if (p791Var == null) {
            u890.C("skipType");
            throw null;
        }
        int iOrdinal = p791Var.ordinal();
        if (iOrdinal == 0) {
            j591Var = new j591(null, 2131952269, 2131952270, null, false);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            j591Var = new j591(2131952281, 2131952278, 2131952280, 2131952279, true);
        }
        TextView textView = (TextView) view.findViewById(2131427568);
        textView.getClass();
        Integer num = j591Var.a;
        textView.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            textView.setText(num.intValue());
        }
        ((TextView) view.findViewById(2131427565)).setText(j591Var.b);
        Button button = (Button) view.findViewById(2131427567);
        button.setText(j591Var.c);
        button.setOnClickListener(new kw6(this, j591Var, str, (byte) 22));
        n3h1 n3h1Var2 = this.Y1;
        if (n3h1Var2 == null) {
            u890.C("skipDialogLogger");
            throw null;
        }
        n3h1Var2.b(str);
        Button button2 = (Button) view.findViewById(2131427566);
        button2.getClass();
        Integer num2 = j591Var.d;
        button2.setVisibility(num2 != null ? 0 : 8);
        if (num2 != null) {
            button2.setText(num2.intValue());
            n3h1 n3h1Var3 = this.Y1;
            if (n3h1Var3 == null) {
                u890.C("skipDialogLogger");
                throw null;
            }
            n3h1Var3.d(str);
        }
        button2.setOnClickListener(new wa21(this, str, (byte) 11));
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        n3h1 o3h1Var;
        super.w0(bundle);
        Bundle bundleO0 = O0();
        p791 p791Var = (p791) f46.n0(bundleO0.getInt("allboarding-skiptype-arg", 1), p791.values());
        if (p791Var == null) {
            p791Var = p791.b;
        }
        this.Z1 = p791Var;
        Bundle bundleO1 = O0();
        p691 p691Var = (p691) f46.n0(bundleO1.getInt("allboarding-skip-origin-arg", 0), p691.values());
        if (p691Var == null) {
            p691Var = p691.a;
        }
        int iOrdinal = p691Var.ordinal();
        if (iOrdinal == 0) {
            i8h1 i8h1Var = this.W1;
            if (i8h1Var == null) {
                u890.C("ubiLogger");
                throw null;
            }
            edr0 edr0Var = this.X1;
            if (edr0Var == null) {
                u890.C("sessionIdProvider");
                throw null;
            }
            o3h1Var = new o3h1(i8h1Var, edr0Var);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            i8h1 i8h1Var2 = this.W1;
            if (i8h1Var2 == null) {
                u890.C("ubiLogger");
                throw null;
            }
            edr0 edr0Var2 = this.X1;
            if (edr0Var2 == null) {
                u890.C("sessionIdProvider");
                throw null;
            }
            o3h1Var = new m3h1(i8h1Var2, edr0Var2);
        }
        this.Y1 = o3h1Var;
        e1(0, 2132018150);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624049, viewGroup, false);
    }
}
