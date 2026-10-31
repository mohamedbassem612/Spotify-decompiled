package p;

import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sfb implements Function {
    public static final sfb a = new sfb();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object apply(Object obj) throws NoWhenBranchMatchedException {
        AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
        if (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Disconnected) {
            return dug.o(w081.c(((AccessoryStateManager$Event.Disconnected) accessoryStateManager$Event).getAccessory()));
        }
        if (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected) {
            return dug.i(w081.c(((AccessoryStateManager$Event.Connected) accessoryStateManager$Event).getAccessory()));
        }
        if (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Updated) {
            return dug.i(w081.c(((AccessoryStateManager$Event.Updated) accessoryStateManager$Event).getAccessory()));
        }
        if (accessoryStateManager$Event.equals(AccessoryStateManager$Event.NoAccessoryConnected.INSTANCE)) {
            return dug.n();
        }
        eg.o();
        return null;
    }
}
