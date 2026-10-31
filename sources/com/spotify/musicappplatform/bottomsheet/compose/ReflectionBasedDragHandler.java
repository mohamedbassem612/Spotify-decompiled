package com.spotify.musicappplatform.bottomsheet.compose;

import com.spotify.base.java.logging.Logger;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.c2p1;
import p.d9n;
import p.eg;
import p.hm5;
import p.idd1;
import p.kma0;
import p.lnm;
import p.mmr0;
import p.nla0;
import p.rih1;
import p.uc11;
import p.upn1;
import p.vc11;
import p.vy71;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u0003\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR-\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R-\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010$¨\u0006)"}, d2 = {"Lcom/spotify/musicappplatform/bottomsheet/compose/ReflectionBasedDragHandler;", "Lp/vy71;", "sheetState", "<init>", "(Lp/vy71;)V", "", "delta", "dispatchRawDelta", "(F)F", "velocity", "Lp/rih1;", "settle", "(FLp/lnm;)Ljava/lang/Object;", "getMinAnchor", "()F", "requireOffset", "Lp/vy71;", "Lp/kma0;", "anchoredDraggableStateField", "Lp/kma0;", "getAnchoredDraggableStateField", "()Lp/kma0;", "Lp/nla0;", "cachedSettleFunction$delegate", "Lp/znb0;", "getCachedSettleFunction", "()Lp/nla0;", "cachedSettleFunction", "", "cachedAnchoredDraggableState$delegate", "getCachedAnchoredDraggableState", "()Ljava/lang/Object;", "cachedAnchoredDraggableState", "Lp/mmr0;", "cachedDispatchRawDataField$delegate", "getCachedDispatchRawDataField", "()Lp/mmr0;", "cachedDispatchRawDataField", "cachedMinAnchorFunction$delegate", "getCachedMinAnchorFunction", "cachedMinAnchorFunction", "src_main_java_com_spotify_musicappplatform_bottomsheet-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ReflectionBasedDragHandler {
    public static final int $stable = 8;
    private final kma0 anchoredDraggableStateField;
    private final vy71 sheetState;

    /* JADX INFO: renamed from: cachedSettleFunction$delegate, reason: from kotlin metadata */
    private final znb0 cachedSettleFunction = new idd1(new uc11(this, 3));

    /* JADX INFO: renamed from: cachedAnchoredDraggableState$delegate, reason: from kotlin metadata */
    private final znb0 cachedAnchoredDraggableState = new idd1(new uc11(this, 0));

    /* JADX INFO: renamed from: cachedDispatchRawDataField$delegate, reason: from kotlin metadata */
    private final znb0 cachedDispatchRawDataField = new idd1(new uc11(this, 1));

    /* JADX INFO: renamed from: cachedMinAnchorFunction$delegate, reason: from kotlin metadata */
    private final znb0 cachedMinAnchorFunction = new idd1(new uc11(this, 2));

    public ReflectionBasedDragHandler(vy71 vy71Var) {
        this.sheetState = vy71Var;
        this.anchoredDraggableStateField = c2p1.q(vy71Var, "anchoredDraggableState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCachedAnchoredDraggableState() {
        return this.cachedAnchoredDraggableState.getValue();
    }

    private final mmr0 getCachedDispatchRawDataField() {
        return (mmr0) this.cachedDispatchRawDataField.getValue();
    }

    private final mmr0 getCachedMinAnchorFunction() {
        return (mmr0) this.cachedMinAnchorFunction.getValue();
    }

    private final nla0 getCachedSettleFunction() {
        return (nla0) this.cachedSettleFunction.getValue();
    }

    public float dispatchRawDelta(float delta) {
        try {
            mmr0 cachedDispatchRawDataField = getCachedDispatchRawDataField();
            if (cachedDispatchRawDataField == null) {
                return 0.0f;
            }
            Object objCall = ((nla0) cachedDispatchRawDataField.b).call(new Object[]{cachedDispatchRawDataField.a, Float.valueOf(delta)});
            Float f = objCall instanceof Float ? (Float) objCall : null;
            if (f != null) {
                return f.floatValue();
            }
            return 0.0f;
        } catch (Exception e) {
            Logger.e(e, "Error invoking dispatchRawDelta via reflection", new Object[0]);
            return 0.0f;
        }
    }

    public final kma0 getAnchoredDraggableStateField() {
        return this.anchoredDraggableStateField;
    }

    public float getMinAnchor() {
        try {
            mmr0 cachedMinAnchorFunction = getCachedMinAnchorFunction();
            if (cachedMinAnchorFunction == null) {
                return 0.0f;
            }
            return ((Float) ((nla0) cachedMinAnchorFunction.b).call(new Object[]{cachedMinAnchorFunction.a})).floatValue();
        } catch (Exception e) {
            Logger.e(e, "getMinAnchor", new Object[0]);
            return 0.0f;
        }
    }

    public float requireOffset() {
        return this.sheetState.e.V();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object settle(float f, lnm<? super rih1> lnmVar) {
        vc11 vc11Var;
        if (lnmVar instanceof vc11) {
            vc11Var = (vc11) lnmVar;
            int i = vc11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc11Var.c = i - Integer.MIN_VALUE;
            } else {
                vc11Var = new vc11(this, lnmVar);
            }
        } else {
            vc11Var = new vc11(this, lnmVar);
        }
        Object obj = vc11Var.a;
        int i2 = vc11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                nla0 cachedSettleFunction = getCachedSettleFunction();
                if (cachedSettleFunction != null) {
                    Object[] objArr = {this.sheetState, new Float(f)};
                    vc11Var.c = 1;
                    Object objH = upn1.h(cachedSettleFunction, objArr, vc11Var);
                    d9n d9nVar = d9n.a;
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception e) {
            Logger.e(e, "Error invoking settle via reflection", new Object[0]);
        }
        return rih1.a;
    }
}
