package p;

import com.spotify.bluejay.data.api.GenerationServiceException;
import j$.time.Duration;
import j$.time.Instant;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fh40 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gh40 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Duration e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh40(gh40 gh40Var, List list, Duration duration, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = gh40Var;
        this.d = list;
        this.e = duration;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new fh40(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new fh40(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.bluejay.data.api.GenerationServiceException */
    public final Object invokeSuspend(Object obj) throws GenerationServiceException {
        byte b = this.a;
        Duration duration = this.e;
        List list = this.d;
        gh40 gh40Var = this.c;
        Serializable serializable = d9n.a;
        Instant instantMinus = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                eg40 eg40Var = gh40Var.a;
                if (duration != null) {
                    int i = eh40.a;
                    instantMinus = Instant.now().minus(duration);
                }
                this.b = true;
                Serializable serializableE = eg40Var.e(list, instantMinus, this);
                return serializableE == serializable ? serializable : serializableE;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                eg40 eg40Var2 = gh40Var.a;
                if (duration != null) {
                    int i2 = eh40.a;
                    instantMinus = Instant.now().minus(duration);
                }
                this.b = true;
                Serializable serializableE2 = eg40Var2.e(list, instantMinus, this);
                return serializableE2 == serializable ? serializable : serializableE2;
        }
    }
}
