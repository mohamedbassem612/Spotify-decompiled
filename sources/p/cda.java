package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cda implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        byte b = 1;
        if (i == 0) {
            kda kdaVar = (kda) message.obj;
            jda jdaVar = kdaVar.c;
            jdaVar.setOnAttachStateChangeListener(new fda(kdaVar));
            if (jdaVar.getParent() == null) {
                h3n layoutParams = jdaVar.getLayoutParams();
                if (layoutParams instanceof h3n) {
                    h3n h3nVar = layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = kdaVar.m;
                    if (baseTransientBottomBar$Behavior == null) {
                        baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    }
                    mp8 mp8Var = baseTransientBottomBar$Behavior.h;
                    mp8Var.getClass();
                    mp8Var.b = kdaVar.o;
                    baseTransientBottomBar$Behavior.b = new jc9(kdaVar, (byte) 2);
                    h3nVar.b(baseTransientBottomBar$Behavior);
                    h3nVar.g = 80;
                }
                kdaVar.f();
                jdaVar.setVisibility(4);
                kdaVar.a.addView(jdaVar);
            }
            WeakHashMap weakHashMap = b8k1.a;
            if (jdaVar.isLaidOut()) {
                kdaVar.e();
                return true;
            }
            jdaVar.setOnLayoutChangeListener(new t4d1(kdaVar, (byte) 27));
            return true;
        }
        byte b2 = 0;
        if (i != 1) {
            return false;
        }
        kda kdaVar2 = (kda) message.obj;
        int i2 = message.arg1;
        jda jdaVar2 = kdaVar2.c;
        AccessibilityManager accessibilityManager = kdaVar2.n;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || jdaVar2.getVisibility() != 0) {
            kdaVar2.c(i2);
            return true;
        }
        if (jdaVar2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(je5.a);
            valueAnimatorOfFloat.addUpdateListener(new bda(kdaVar2, (byte) 0));
            valueAnimatorOfFloat.setDuration(75L);
            valueAnimatorOfFloat.addListener(new ada(kdaVar2, i2, b2));
            valueAnimatorOfFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        jda jdaVar3 = kdaVar2.c;
        int height = jdaVar3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = jdaVar3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(je5.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new ada(kdaVar2, i2, b));
        valueAnimator.addUpdateListener(new bda(kdaVar2, (byte) 3));
        valueAnimator.start();
        return true;
    }
}
