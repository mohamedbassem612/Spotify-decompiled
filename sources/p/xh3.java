package p;

import androidx.car.app.navigation.model.Maneuver;
import com.ravelin.core.model.BiometricProperties;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.Payload;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xh3 implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ xh3(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                zzq0 zzq0Var = gi3.a;
                return kjr.a;
            case 1:
                return UUID.randomUUID();
            case 2:
                return "DEFAULT_TEST_TAG";
            case 3:
                return UUID.randomUUID();
            case 4:
            case 5:
            case 6:
                return rih1Var;
            case 7:
                return new b8f1(-3.4028235E38f, 0.0f, 0.0f);
            case 8:
                kiv kivVar = ti5.a;
                return xps.a;
            case 9:
                kiv kivVar2 = ti5.a;
                return bys.a;
            case 10:
                return new n6a1(z4p1.e(1308617531));
            case 11:
                throw new ClassCastException();
            case 12:
                return null;
            case 13:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return yon1.O().c;
            case 14:
                BiometricProperties.CoM4 coM4 = BiometricProperties.Companion;
                return new v811(rc11.a.b(String.class), chc1.a);
            case 15:
                long jG = z4p1.g(4284612846L);
                long jG2 = z4p1.g(4281794739L);
                long jG3 = z4p1.g(4278442694L);
                long jG4 = z4p1.g(4278290310L);
                long j = u7h.f;
                long jG5 = z4p1.g(4289724448L);
                long j2 = u7h.b;
                return new bbh(jG, jG2, jG3, jG4, j, j, jG5, j, j2, j2, j2, j);
            case 16:
                return null;
            case 17:
                g0k.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 18:
                return Float.valueOf(1.0f);
            case 19:
                return Float.valueOf(1.0f);
            case 20:
            case 21:
            case 22:
            case 23:
                return rih1Var;
            case 24:
                kiv kivVar3 = fuw.a;
                return lwr.a;
            case 25:
                return new p3v(0.0f);
            case 26:
                Events.CoM4 coM5 = Events.Companion;
                return new v811(rc11.a.b(Payload.class), Payload.cOm9.lpt2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.FALSE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new pi30(v8r.q((Object) null));
            default:
                return new vu40(new xah(), new l2h1(), new l1i());
        }
    }
}
