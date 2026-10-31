package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ac10 implements FlowableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ ac10(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static Float b(ContextTrack contextTrack) {
        String str;
        Float fB0;
        j380 j380VarMetadata = contextTrack.metadata();
        if (j380VarMetadata == null || (str = (String) j380VarMetadata.get("item.speed")) == null || (fB0 = nhc1.b0(str)) == null) {
            return null;
        }
        float fFloatValue = fB0.floatValue();
        if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
            return null;
        }
        return fB0;
    }

    public final moy0 a(Flowable flowable) {
        switch (this.a) {
            case 0:
                return new FlowableSwitchMapSingle(flowable.s(yb10.b).L((Scheduler) this.d), new mev(this, (byte) 13)).t(Functions.a);
            case 1:
                return flowable.t(Functions.a).X(new y281(this, (byte) 2));
            default:
                Flowable flowableX = Flowable.h(flowable, yoi1.h(((hp91) this.c).k(), o6x.a), p5x0.Q0).t(new khc(this, (byte) 25)).X(new ep31(this, (byte) 20));
                flowableX.getClass();
                return flowableX.t(Functions.a);
        }
    }
}
