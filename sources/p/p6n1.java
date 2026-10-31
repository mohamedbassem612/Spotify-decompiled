package p;

import com.ravelin.core.model.Events;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.model.Payload;
import com.ravelin.core.model.SharedPackages;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lp/p6n1;", "", "", "token", "Lcom/ravelin/core/model/Events;", "objectAsJSon", "Lp/dxc;", "Lp/rih1;", "b", "(Ljava/lang/String;Lcom/ravelin/core/model/Events;)Lp/dxc;", "Lcom/ravelin/core/model/Payload;", "source", "d", "(Ljava/lang/String;Lcom/ravelin/core/model/Payload;Ljava/lang/String;)Lp/dxc;", "Lcom/ravelin/core/model/MobileReportRequest;", "mobileReportRequest", "a", "(Ljava/lang/String;Lcom/ravelin/core/model/MobileReportRequest;)Lp/dxc;", "Lcom/ravelin/core/model/SharedPackages;", "sharedPackages", "c", "(Ljava/lang/String;Lcom/ravelin/core/model/SharedPackages;)Lp/dxc;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface p6n1 {
    @wyq0("mobilereport")
    dxc<rih1> a(@dv50("Authorization") String token, @elb MobileReportRequest mobileReportRequest);

    @wyq0("click")
    dxc<rih1> b(@dv50("Authorization") String token, @elb Events objectAsJSon);

    @wyq0("sdk/sharedpackages")
    dxc<rih1> c(@dv50("Authorization") String token, @elb SharedPackages sharedPackages);

    @wyq0("fingerprint")
    dxc<rih1> d(@dv50("Authorization") String token, @elb Payload objectAsJSon, @u0z0("source") String source);
}
