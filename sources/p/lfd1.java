package p;

import androidx.car.app.dialer.InCallTemplate;
import androidx.car.app.dialer.TelephoneKeypadTemplate;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lfd1 {
    public static final lfd1 b;
    public final HashSet a;

    static {
        new lfd1(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class));
        new lfd1(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class));
        b = new lfd1(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class, SectionedItemTemplate.class, InCallTemplate.class, TelephoneKeypadTemplate.class));
    }

    public lfd1(List list) {
        this.a = new HashSet(list);
    }
}
