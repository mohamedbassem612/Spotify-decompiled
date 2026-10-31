package androidx.car.app.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p.l1d;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@qrd
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private sxd1 mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(sxd1 sxd1Var, String str) {
        Objects.requireNonNull(sxd1Var);
        Objects.requireNonNull(str);
        return new TemplateWrapper(sxd1Var, str);
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        Objects.requireNonNull(str);
        return str;
    }

    public sxd1 getTemplate() {
        sxd1 sxd1Var = this.mTemplate;
        Objects.requireNonNull(sxd1Var);
        return sxd1Var;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        List<TemplateInfo> list = this.mTemplateInfoForScreenStack;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(sxd1 sxd1Var) {
        this.mTemplate = sxd1Var;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[template: ");
        sb.append(this.mTemplate);
        sb.append(", ID: ");
        return l1d.n(this.mId, "]", sb);
    }

    public static TemplateWrapper wrap(sxd1 sxd1Var) {
        return wrap(sxd1Var, createRandomId());
    }

    private TemplateWrapper(sxd1 sxd1Var, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = sxd1Var;
        this.mId = str;
    }
}
