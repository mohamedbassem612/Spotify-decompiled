package p;

import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rfb implements Predicate {
    public static final rfb a = new rfb();

    public final boolean test(Object obj) {
        AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
        if ((accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected) || (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Disconnected)) {
            return true;
        }
        return ((accessoryStateManager$Event instanceof AccessoryStateManager$Event.Updated) && u890.j(((qi) ((AccessoryStateManager$Event.Updated) accessoryStateManager$Event).getAccessory()).g, Boolean.TRUE)) || (accessoryStateManager$Event instanceof AccessoryStateManager$Event.NoAccessoryConnected);
    }
}
