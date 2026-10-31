package p;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.nsd.NsdManager;
import android.os.StatFs;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.SecondaryButtonView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import java.io.File;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mo2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo2(Context context, byte b) {
        super(0);
        this.a = b;
        this.b = context;
    }

    public final Object invoke() {
        long blockCount;
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(x74.j(context, "android.permission.RECORD_AUDIO") == 0);
            case 1:
                return context.getString(2131960630);
            case 2:
                return new ilw0("#FF535353", "#000000", context.getString(2131956351));
            case 3:
                return Float.valueOf(context.getResources().getDimension(2131165734));
            case 4:
                File fileI = y520.I(context.getCacheDir(), "coil_cache");
                gka0 gka0Var = i520.a;
                String str = s8s0.b;
                s8s0 s8s0VarE = gtv0.e(fileI);
                try {
                    StatFs statFs = new StatFs(fileI.getAbsolutePath());
                    blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
                    break;
                } catch (IllegalArgumentException unused) {
                    blockCount = 5242880;
                }
                long jMax = Math.max(Math.min(blockCount, 52428800L), 5242880L);
                if (jMax > 0) {
                    return new mf01(jMax, gka0Var, s8s0VarE);
                }
                hhg1.n("size must be > 0.");
                return null;
            case 5:
                return Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f);
            case 6:
                Drawable drawable = context.getDrawable(2131231571);
                if (drawable != null) {
                    drawable.mutate().setTint(context.getColor(2131101551));
                }
                return drawable;
            case 7:
                return context.getDrawable(2131232977);
            case 8:
                return Boolean.valueOf(!context.getPackageManager().queryIntentActivities(new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"), 65536).isEmpty());
            case 9:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624604, (ViewGroup) null, false);
                int i = 2131427749;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427749);
                if (textView != null) {
                    i = 2131428717;
                    EqualizerView equalizerViewT = m5n1.t(constraintLayoutInflate, 2131428717);
                    if (equalizerViewT != null) {
                        i = 2131429711;
                        if (m5n1.t(constraintLayoutInflate, 2131429711) != null) {
                            i = 2131431449;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431449);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                ffz ffzVar = new ffz(constraintLayout, textView, equalizerViewT, textView2);
                                eqq.t(-1, -1, constraintLayout);
                                return ffzVar;
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                return null;
            case 10:
                View viewInflate = LayoutInflater.from(context).inflate(2131625097, (ViewGroup) null, false);
                PrimaryButtonView primaryButtonViewT = m5n1.t(viewInflate, 2131427839);
                if (primaryButtonViewT == null) {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131427839)));
                    return null;
                }
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                hc90 hc90Var = new hc90(frameLayout, primaryButtonViewT);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return hc90Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625098, (ViewGroup) null, false);
                SecondaryButtonView secondaryButtonViewT = m5n1.t(constraintLayoutInflate2, 2131427839);
                if (secondaryButtonViewT == null) {
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(2131427839)));
                    return null;
                }
                ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                lc90 lc90Var = new lc90(constraintLayout2, secondaryButtonViewT);
                eqq.t(-1, -2, constraintLayout2);
                return lc90Var;
            case grn1.d /* 12 */:
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setAnimateParentHierarchy(false);
                frameLayout2.setLayoutTransition(layoutTransition);
                rwq0.s(frameLayout2, new his(frameLayout2, (byte) 0));
                return frameLayout2;
            case 13:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131626260, (ViewGroup) null, false);
                int i2 = 2131431356;
                EncoreTitleView encoreTitleViewT = m5n1.t(constraintLayoutInflate3, 2131431356);
                if (encoreTitleViewT != null) {
                    i2 = 2131431395;
                    SwitchCompat switchCompatT = m5n1.t(constraintLayoutInflate3, 2131431395);
                    if (switchCompatT != null) {
                        ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                        kze1 kze1Var = new kze1(constraintLayout3, encoreTitleViewT, switchCompatT);
                        eqq.t(-1, -2, constraintLayout3);
                        return kze1Var;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i2)));
                return null;
            case 14:
                return new bf(context);
            case 15:
                ConstraintLayout constraintLayoutInflate4 = LayoutInflater.from(context).inflate(2131626344, (ViewGroup) null, false);
                int i3 = 2131431694;
                if (((ImageView) m5n1.t(constraintLayoutInflate4, 2131431694)) != null) {
                    i3 = 2131431698;
                    RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate4, 2131431698);
                    if (recyclerViewT != null) {
                        i3 = 2131431699;
                        TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate4, 2131431699);
                        if (textView3 != null) {
                            ConstraintLayout constraintLayout4 = constraintLayoutInflate4;
                            knl1 knl1Var = new knl1(textView3, constraintLayout4, constraintLayout4, recyclerViewT);
                            eqq.t(-1, -2, constraintLayout4);
                            return knl1Var;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate4.getResources().getResourceName(i3)));
                return null;
            case 16:
                return new bf(context);
            case 17:
                BadgeGroupView badgeGroupView = new BadgeGroupView(this.b, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                badgeGroupView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                WeakHashMap weakHashMap = b8k1.a;
                badgeGroupView.setId(View.generateViewId());
                return badgeGroupView;
            case 18:
                PlayProgressBarView playProgressBarView = new PlayProgressBarView(this.b, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                WeakHashMap weakHashMap2 = b8k1.a;
                playProgressBarView.setId(View.generateViewId());
                return playProgressBarView;
            case 19:
                return new bf(context);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new bf(context);
            case 21:
                return new bf(context);
            case 22:
                Object systemService = context.getSystemService("servicediscovery");
                NsdManager nsdManager = systemService instanceof NsdManager ? (NsdManager) systemService : null;
                if (nsdManager == null) {
                    n57.q(new otj0("Expected Context.NSD_SERVICE but was missing", null));
                }
                return nsdManager;
            case 23:
                return azo1.q(2131104462, context, j4b1.g);
            case 24:
                return azo1.q(2131101342, context, j4b1.G1);
            case 25:
                return new at40(context);
            case 26:
                return new non1(context.getApplicationContext(), null, non1.l, mh5.k, jz40.c);
            case 27:
                return Integer.valueOf(context.getColor(2131101574));
            case 28:
                return Integer.valueOf(context.getColor(2131101575));
            default:
                return Integer.valueOf(context.getColor(2131101576));
        }
    }
}
