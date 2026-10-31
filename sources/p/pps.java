package p;

import com.spotify.podcastexperience.showpreferencesimpl.DefaultShowSortOrderPreferences;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pps implements nma0 {
    public static final pps a = new pps();
    public static final qnw0 b = omo1.c("SortOrderJsonModel", knw0.o);

    public final Object deserialize(dar darVar) {
        Object next;
        String strV = darVar.V();
        Iterator it = DefaultShowSortOrderPreferences.SortOrderJsonModel.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((DefaultShowSortOrderPreferences.SortOrderJsonModel) next).name(), strV));
        DefaultShowSortOrderPreferences.SortOrderJsonModel sortOrderJsonModel = (DefaultShowSortOrderPreferences.SortOrderJsonModel) next;
        return sortOrderJsonModel == null ? DefaultShowSortOrderPreferences.SortOrderJsonModel.BY_CONSUMPTION_ORDER : sortOrderJsonModel;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0(((DefaultShowSortOrderPreferences.SortOrderJsonModel) obj).name());
    }
}
