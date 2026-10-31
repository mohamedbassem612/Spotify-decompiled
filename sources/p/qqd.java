package p;

import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qqd implements Function {
    public static final qqd a = new qqd();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object apply(Object obj) throws NoWhenBranchMatchedException {
        AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
        String lowerCase = "CAR".toLowerCase(Locale.ROOT);
        if (!(accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected) && !(accessoryStateManager$Event instanceof AccessoryStateManager$Event.Updated)) {
            if (!(accessoryStateManager$Event instanceof AccessoryStateManager$Event.Disconnected) && !accessoryStateManager$Event.equals(AccessoryStateManager$Event.NoAccessoryConnected.INSTANCE)) {
                eg.o();
                return null;
            }
            Observable observableJust = Observable.just(new oqd(lowerCase));
            observableJust.getClass();
            return observableJust;
        }
        hi accessory = accessoryStateManager$Event.getAccessory();
        if (accessory != null ? u890.j(((qi) accessory).g, Boolean.TRUE) : false) {
            Observable observableJust2 = Observable.just(new nqd(lowerCase));
            observableJust2.getClass();
            return observableJust2;
        }
        Observable observableJust3 = Observable.just(new oqd(lowerCase));
        observableJust3.getClass();
        return observableJust3;
    }
}
