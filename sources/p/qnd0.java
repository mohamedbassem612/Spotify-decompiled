package p;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qnd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnd0(gdl1 gdl1Var, Context context) {
        super(0);
        this.a = (byte) 19;
        this.b = context;
    }

    public final Object invoke() {
        byte b = this.a;
        Context baseContext = this.b;
        switch (b) {
            case 0:
                return x74.E(baseContext, 2131101391);
            case 1:
                return baseContext.getResources().getString(2131957505);
            case 2:
                return x74.E(baseContext, 2131101752);
            case 3:
                return baseContext.getResources().getString(2131957506);
            case 4:
                return x74.E(baseContext, 2131103618);
            case 5:
                return baseContext.getResources().getString(2131957507);
            case 6:
                a5e0 a5e0Var = b5e0.i;
                try {
                    ActivityManager activityManager = (ActivityManager) baseContext.getSystemService(ActivityManager.class);
                    if (activityManager == null) {
                        return null;
                    }
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    return new esi0(memoryInfo.availMem, memoryInfo.threshold, memoryInfo.lowMemory);
                } catch (RuntimeException e) {
                    Logger.l(e, "Failed to read memory snapshot", new Object[0]);
                    return null;
                }
            case 7:
                LinearLayout linearLayout = new LinearLayout(baseContext);
                int dimensionPixelSize = baseContext.getResources().getDimensionPixelSize(2131166216);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(baseContext);
                lqc lqcVar = LoadingView.S0;
                LoadingView loadingViewInflate = layoutInflaterFrom.inflate(2131625163, (ViewGroup) null);
                if (loadingViewInflate.N0 == 1) {
                    loadingViewInflate.N0 = 2;
                    loadingViewInflate.postDelayed(loadingViewInflate.O0, 0L);
                }
                linearLayout.addView(loadingViewInflate);
                return linearLayout;
            case 8:
                return Long.valueOf(baseContext.getResources().getInteger(R.integer.config_shortAnimTime));
            case 9:
                return Integer.valueOf(baseContext.getColor(2131101285));
            case 10:
                return yon1.l1(baseContext);
            case 11:
                return (ConnectivityManager) baseContext.getSystemService("connectivity");
            case 12:
                Drawable drawable = baseContext.getDrawable(2131232966);
                drawable.getClass();
                drawable.setTintList(x74.E(baseContext, 2131101340));
                return drawable;
            case 13:
                Rive.init$default(Rive.INSTANCE, baseContext.getApplicationContext(), (RendererType) null, 2, (Object) null);
                return rih1.a;
            case 14:
                return baseContext.getDrawable(2131233875);
            case 15:
                return baseContext.getDrawable(2131233876);
            case 16:
                Drawable drawable2 = baseContext.getDrawable(2131231209);
                if (drawable2 == null) {
                    return null;
                }
                drawable2.mutate().setTintList(x74.E(baseContext, 2131101341));
                return drawable2;
            case 17:
                Drawable drawable3 = baseContext.getDrawable(2131231569);
                if (drawable3 == null) {
                    return null;
                }
                drawable3.mutate().setTintList(x74.E(baseContext, 2131101342));
                return drawable3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                Drawable drawableJ = f0o1.j(baseContext, 2131233931);
                if (drawableJ != null) {
                    return drawableJ;
                }
                eg.m("Could not get drawable for loading");
                return null;
        }
        do {
            Activity activity = baseContext instanceof Activity ? (Activity) baseContext : null;
            if (activity != null) {
                return activity;
            }
            ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
            if (contextWrapper == null) {
                return null;
            }
            baseContext = contextWrapper.getBaseContext();
        } while (baseContext != null);
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qnd0(Context context, byte b) {
        super(0);
        this.a = b;
        this.b = context;
    }
}
