package p;

import com.spotify.culturalmoments.stories.v1.GetStoriesRequest;
import com.spotify.culturalmoments.stories.v1.GetStoriesResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/y4c1;", "", "Lcom/spotify/culturalmoments/stories/v1/GetStoriesRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/culturalmoments/stories/v1/GetStoriesResponse;", "a", "(Lcom/spotify/culturalmoments/stories/v1/GetStoriesRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_culturalmoments_stories-stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface y4c1 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("https://spclient.wg.spotify.com/cultural-moments-stories/stories")
    Single<GetStoriesResponse> a(@elb GetStoriesRequest request);
}
