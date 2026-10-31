package p;

import com.spotify.musicappplatform.bottomsheet.compose.ReflectionBasedDragHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wwb implements d6o0 {
    public final ReflectionBasedDragHandler a;

    public wwb(ReflectionBasedDragHandler reflectionBasedDragHandler) {
        this.a = reflectionBasedDragHandler;
    }

    public final long M(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        float fDispatchRawDelta = this.a.dispatchRawDelta(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fDispatchRawDelta)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(long j, long j2, lnm lnmVar) {
        uwb uwbVar;
        if (lnmVar instanceof uwb) {
            uwbVar = (uwb) lnmVar;
            int i = uwbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uwbVar.d = i - Integer.MIN_VALUE;
            } else {
                uwbVar = new uwb(this, (onm) lnmVar);
            }
        } else {
            uwbVar = new uwb(this, (onm) lnmVar);
        }
        Object obj = uwbVar.b;
        int i2 = uwbVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            float fE = qui1.e(j2);
            uwbVar.a = j2;
            uwbVar.d = 1;
            Object obj2 = this.a.settle(fE, uwbVar);
            d9n d9nVar = d9n.a;
            if (obj2 == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = uwbVar.a;
            hm5.M(obj);
        }
        return new qui1(j2);
    }

    public final long h0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(this.a.dispatchRawDelta(Float.intBitsToFloat((int) (j2 & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k0(long j, lnm lnmVar) {
        vwb vwbVar;
        if (lnmVar instanceof vwb) {
            vwbVar = (vwb) lnmVar;
            int i = vwbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vwbVar.d = i - Integer.MIN_VALUE;
            } else {
                vwbVar = new vwb(this, (onm) lnmVar);
            }
        } else {
            vwbVar = new vwb(this, (onm) lnmVar);
        }
        Object obj = vwbVar.b;
        int i2 = vwbVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            float fE = qui1.e(j);
            ReflectionBasedDragHandler reflectionBasedDragHandler = this.a;
            float fRequireOffset = reflectionBasedDragHandler.requireOffset();
            float minAnchor = reflectionBasedDragHandler.getMinAnchor();
            if (fE >= 0.0f || fRequireOffset <= minAnchor) {
                j = 0;
            } else {
                vwbVar.a = j;
                vwbVar.d = 1;
                Object obj2 = reflectionBasedDragHandler.settle(fE, vwbVar);
                d9n d9nVar = d9n.a;
                if (obj2 == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = vwbVar.a;
            hm5.M(obj);
        }
        return new qui1(j);
    }
}
