package com.spotify.share.sheet.sections.offplatform.impl;

import com.spotify.share.sheet.sections.offplatform.api.ShareSheetOffPlatformSection;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.ki71;
import p.qv61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/share/sheet/sections/offplatform/impl/ShareSheetOffPlatformSectionImpl;", "Lcom/spotify/share/sheet/sections/offplatform/api/ShareSheetOffPlatformSection;", "Lp/ki71;", "sectionElement", "<init>", "(Lp/ki71;)V", "src_main_java_com_spotify_share_sheet_sections_offplatform_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ShareSheetOffPlatformSectionImpl implements ShareSheetOffPlatformSection {
    public final ki71 a;

    public ShareSheetOffPlatformSectionImpl(ki71 ki71Var) {
        this.a = ki71Var;
    }

    public final boolean a() {
        return true;
    }

    public final Function0 b() {
        return new qv61(this, (byte) 10);
    }
}
