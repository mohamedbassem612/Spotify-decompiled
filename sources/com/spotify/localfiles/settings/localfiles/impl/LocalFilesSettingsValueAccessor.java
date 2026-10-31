package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.Metadata;
import p.d9n;
import p.eg;
import p.hm5;
import p.ht61;
import p.it61;
import p.jt61;
import p.lnm;
import p.lt20;
import p.mr20;
import p.n57;
import p.onm;
import p.ov61;
import p.q8r;
import p.q8t0;
import p.tu41;
import p.tv80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/localfiles/settings/localfiles/impl/LocalFilesSettingsValueAccessor;", "Lp/ov61;", "", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "localFilesFeature", "<init>", "(Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;)V", "oldValue", "newValue", "Lp/tv80;", "interactionLoggingResult", "Lp/jt61;", "setValue", "(Ljava/lang/Boolean;ZLp/tv80;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "Lp/mr20;", "getValue", "()Lp/mr20;", "value", "src_main_java_com_spotify_localfiles_settings_localfiles_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocalFilesSettingsValueAccessor extends ov61 {
    private final LocalFilesFeature localFilesFeature;

    /* JADX INFO: renamed from: com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor$setValue$1, reason: invalid class name */
    @q8r(c = "com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor", f = "LocalFilesSettingsValueAccessor.kt", l = {WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER}, m = "setValue", v = 2)
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1 extends onm {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lnm<? super AnonymousClass1> lnmVar) {
            super(lnmVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalFilesSettingsValueAccessor.this.setValue((Boolean) null, false, (tv80) null, (lnm<? super jt61>) this);
        }
    }

    public LocalFilesSettingsValueAccessor(LocalFilesFeature localFilesFeature) {
        this.localFilesFeature = localFilesFeature;
    }

    public mr20 getValue() {
        return new lt20(new tu41(this.localFilesFeature.isEnabled(), (byte) 9), new q8t0(3, null, (byte) 13), (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm<? super jt61> lnmVar) {
        AnonymousClass1 anonymousClass1;
        if (lnmVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) lnmVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(lnmVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(lnmVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                LocalFilesFeature localFilesFeature = this.localFilesFeature;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.Z$0 = z;
                anonymousClass1.label = 1;
                Object enabled = localFilesFeature.setEnabled(z, anonymousClass1);
                d9n d9nVar = d9n.a;
                if (enabled == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = anonymousClass1.Z$0;
                hm5.M(obj);
            }
            return new it61(Boolean.valueOf(z));
        } catch (Exception e) {
            n57.g("Failed to " + (z ? "enabled" : "disable") + " Local Files feature in settings", e);
            return new ht61((Integer) null, 0);
        }
    }

    public /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, (lnm<? super jt61>) lnmVar);
    }
}
