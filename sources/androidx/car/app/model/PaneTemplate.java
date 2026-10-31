package androidx.car.app.model;

import java.util.Iterator;
import java.util.Objects;
import p.qrd;
import p.rnr0;
import p.sxd1;
import p.vu50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class PaneTemplate implements sxd1 {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Banner mBanner;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    public PaneTemplate(rnr0 rnr0Var) {
        this.mTitle = rnr0Var.a;
        this.mPane = rnr0Var.b;
        this.mHeaderAction = rnr0Var.c;
        this.mActionStrip = rnr0Var.d;
        this.mHeader = rnr0Var.e;
        this.mBanner = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader) && Objects.equals(this.mBanner, paneTemplate.mBanner);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        vu50 vu50Var = new vu50();
        CarText carText = this.mTitle;
        if (carText != null) {
            vu50Var.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            vu50Var.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                vu50Var.a(it.next());
            }
        }
        return vu50Var.b();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        Objects.requireNonNull(pane);
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader, this.mBanner);
    }

    public String toString() {
        return "PaneTemplate";
    }

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
        this.mBanner = null;
    }
}
