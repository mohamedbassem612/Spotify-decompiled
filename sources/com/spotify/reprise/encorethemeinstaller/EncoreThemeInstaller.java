package com.spotify.reprise.encorethemeinstaller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.apo;
import p.b0k;
import p.djx;
import p.fkj0;
import p.h311;
import p.iu30;
import p.myx;
import p.nyx;
import p.o6;
import p.p5x0;
import p.qxd0;
import p.tgp1;
import p.tw20;
import p.v340;
import p.wux;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/reprise/encorethemeinstaller/EncoreThemeInstaller;", "Lp/o6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_reprise_encorethemeinstaller-encorethemeinstaller"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class EncoreThemeInstaller extends o6 {
    public static final /* synthetic */ int N0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public EncoreThemeInstaller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setViewCompositionStrategy(p5x0.W0);
        setTag(2131428196, Boolean.FALSE);
    }

    public static void z(View view) {
        if (view instanceof o6) {
            ((o6) view).l();
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                z(childAt);
                i = i2;
            }
        }
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(533874377);
        int i2 = (x340Var.g(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(147403094, new myx(this), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new myx(this, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1727253710);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) getParent();
            v340 v340VarU = tgp1.u(x340Var);
            boolean zI = x340Var.i(view) | x340Var.i(v340VarU) | ((i2 & 14) == 4 || x340Var.i(this));
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new djx(view, v340VarU, this, (byte) 1);
                x340Var.s0(objT);
            }
            qxd0.h(view, v340VarU, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new myx(this, i, (byte) 2);
        }
    }

    public EncoreThemeInstaller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreThemeInstaller(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreThemeInstaller(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
