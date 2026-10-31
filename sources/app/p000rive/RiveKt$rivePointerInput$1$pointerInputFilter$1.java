package app.p000rive;

import android.os.Trace;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.StateMachineHandle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bav0;
import p.cav0;
import p.hav0;
import p.kav0;
import p.nla0;
import p.p7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"app/rive/RiveKt$rivePointerInput$1$pointerInputFilter$1", "Lp/kav0;", "Lp/bav0;", "pointerEvent", "Lp/cav0;", "pass", "Lp/yr80;", "bounds", "Lp/rih1;", "onPointerEvent-H0pRuoY", "(Lp/bav0;Lp/cav0;J)V", "onPointerEvent", "onCancel", "()V", "", "shareWithSiblings", "Z", "getShareWithSiblings", "()Z", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$rivePointerInput$1$pointerInputFilter$1 extends kav0 {
    final /* synthetic */ StateMachine $activeStateMachine;
    final /* synthetic */ Fit $fit;
    final /* synthetic */ RivePointerInputMode $pointerInputMode;
    final /* synthetic */ Function0 $requestPausedFrame;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ long $stateMachineHandle;
    final /* synthetic */ int $surfaceHeight;
    final /* synthetic */ int $surfaceWidth;
    private final boolean shareWithSiblings;

    public RiveKt$rivePointerInput$1$pointerInputFilter$1(RivePointerInputMode rivePointerInputMode, StateMachine stateMachine, CommandQueue commandQueue, Function0 function0, long j, Fit fit, int i, int i2) {
        this.$pointerInputMode = rivePointerInputMode;
        this.$activeStateMachine = stateMachine;
        this.$riveWorker = commandQueue;
        this.$requestPausedFrame = function0;
        this.$stateMachineHandle = j;
        this.$fit = fit;
        this.$surfaceWidth = i;
        this.$surfaceHeight = i2;
        this.shareWithSiblings = rivePointerInputMode == RivePointerInputMode.PassThrough;
    }

    @Override // p.kav0
    public boolean getShareWithSiblings() {
        return this.shareWithSiblings;
    }

    @Override // p.kav0
    public void onCancel() {
    }

    @Override // p.kav0
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo85onPointerEventH0pRuoY(bav0 pointerEvent, cav0 pass, long bounds) {
        List listSingletonList;
        StateMachine stateMachine = this.$activeStateMachine;
        CommandQueue commandQueue = this.$riveWorker;
        Function0 function0 = this.$requestPausedFrame;
        RivePointerInputMode rivePointerInputMode = this.$pointerInputMode;
        long j = this.$stateMachineHandle;
        Fit fit = this.$fit;
        int i = this.$surfaceWidth;
        int i2 = this.$surfaceHeight;
        Trace.beginSection("Rive/PointerInput");
        try {
            if (pass == cav0.b) {
                stateMachine.unsettle$kotlin_release();
                int i3 = pointerEvent.f;
                if (i3 == 3) {
                    listSingletonList = Collections.singletonList(new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$1(commandQueue));
                } else if (i3 == 2) {
                    listSingletonList = p7h.M(new nla0[]{new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$2(commandQueue), new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$3(commandQueue)});
                } else if (i3 == 1) {
                    listSingletonList = Collections.singletonList(new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$4(commandQueue));
                } else if (i3 == 5) {
                    listSingletonList = Collections.singletonList(new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$5(commandQueue));
                }
                Iterator it = pointerEvent.a.iterator();
                while (it.hasNext()) {
                    hav0 hav0Var = (hav0) it.next();
                    long j2 = hav0Var.c;
                    Iterator it2 = listSingletonList.iterator();
                    while (it2.hasNext()) {
                        ((nla0) it2.next()).invoke(StateMachineHandle.m434boximpl(j), fit, Float.valueOf(i), Float.valueOf(i2), Integer.valueOf((int) hav0Var.a), Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L))));
                        it = it;
                        i = i;
                        j2 = j2;
                        i2 = i2;
                    }
                    int i4 = i2;
                    Iterator it3 = it;
                    int i5 = i;
                    if (rivePointerInputMode == RivePointerInputMode.Consume) {
                        hav0Var.a();
                    }
                    it = it3;
                    i = i5;
                    i2 = i4;
                }
                function0.invoke();
            }
        } finally {
            Trace.endSection();
        }
    }
}
