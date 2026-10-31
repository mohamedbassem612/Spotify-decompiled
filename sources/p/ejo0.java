package p;

import com.google.protobuf.Timestamp;
import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.gander.v2.proto.EntityImage;
import com.spotify.gander.v2.proto.MessagingMetadata;
import com.spotify.gander.v2.proto.MultiUserImage;
import com.spotify.gander.v2.proto.Notification;
import com.spotify.gander.v2.proto.NotificationAction;
import com.spotify.gander.v2.proto.UserAndEntityImage;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ejo0 extends g implements v2j0 {
    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m829mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(NotificationAction notificationAction) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.y(notificationAction);
    }

    public final void q(Timestamp timestamp) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.z(timestamp);
    }

    public final void r(EntityImage entityImage) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.A(entityImage);
    }

    public final void s(String str) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.B(str);
    }

    public final void t(boolean z) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.setIsNew(z);
    }

    public final void u(MessagingMetadata messagingMetadata) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.C(messagingMetadata);
    }

    public final void v(MultiUserImage multiUserImage) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.D(multiUserImage);
    }

    public final void w(String str) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.E(str);
    }

    public final void x(String str) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.F(str);
    }

    public final void y(UserAndEntityImage userAndEntityImage) {
        copyOnWrite();
        Notification notification = (Notification) ((g) this).instance;
        int i = Notification.ID_FIELD_NUMBER;
        notification.G(userAndEntityImage);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m828clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m830mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m827clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m831mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super/*p.r8*/.mergeFrom(phcVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super/*p.r8*/.mergeFrom(lwgVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super/*p.r8*/.mergeFrom(s2j0Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super/*p.r8*/.mergeFrom(bArr);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }
}
