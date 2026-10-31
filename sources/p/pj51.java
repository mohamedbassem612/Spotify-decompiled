package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.BannerSection;
import androidx.car.app.model.ChipSection;
import androidx.car.app.model.CondensedSection;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.Header;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.Section;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.SpotlightSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pj51 {
    public List a = new ArrayList();
    public List b = new ArrayList();
    public Header c = null;
    public boolean d = false;
    public boolean e = false;

    public final SectionedItemTemplate a() {
        if (this.d && !this.a.isEmpty()) {
            hhg1.n("A template cannot both be in a loading state and have sections added");
            return null;
        }
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            Section section = (Section) this.a.get(i);
            if (section instanceof ChipSection) {
                if (z) {
                    hhg1.n("Only one ChipSection is allowed in SectionedItemTemplate.");
                    return null;
                }
                if (i != 0) {
                    hhg1.n("ChipSection must be the first section in SectionedItemTemplate.");
                    return null;
                }
                z = true;
            } else if (!(section instanceof RowSection) && !(section instanceof GridSection) && !(section instanceof CondensedSection) && !(section instanceof SpotlightSection) && !(section instanceof BannerSection)) {
                hhg1.n("Only ChipSections, RowSections, GridSections, CondensedSections, SpotlightSections, and BannerSections are allowed in SectionedItemTemplate.");
                return null;
            }
        }
        return new SectionedItemTemplate(this, 0);
    }

    public final void b(List list) {
        v90.o.a(list);
        Iterator it = list.iterator();
        while (it.hasNext() && ((Action) it.next()).getType() != 65542) {
        }
        this.b = list;
    }
}
